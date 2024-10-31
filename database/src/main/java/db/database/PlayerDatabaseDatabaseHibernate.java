package db.database;

import db.IPlayerDatabase;
import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import objects.Person;
import objects.Player;
import org.hibernate.HibernateException;

import java.util.List;

public class PlayerDatabaseDatabaseHibernate implements IPlayerDatabase {
    private static PlayerDatabaseDatabaseHibernate instance;

    private PlayerDatabaseDatabaseHibernate() {
    }

    public static PlayerDatabaseDatabaseHibernate getInstance() {
        if (instance == null) {
            instance = new PlayerDatabaseDatabaseHibernate();
        }
        return instance;
    }

    public void createPlayersFromLocal(List<Player> players) {
        try (EntityManager entityManager = HibernateUtils.getEntityManager()) {
            entityManager.getTransaction().begin();
            for (Player player : players) {
                entityManager.persist(player);
            }
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Player> getPlayerList() {
        try (EntityManager entityManager = HibernateUtils.getEntityManager()) {
            List<Player> players = entityManager.createQuery("from Player").getResultList();
            return players;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Player getPlayerById(Integer id) {
        try(EntityManager entityManager = HibernateUtils.getEntityManager()){
            return entityManager.find(Player.class, id);
        }
    }

    @Override
    public void addPlayer(Player player) {
        try(EntityManager entityManager = HibernateUtils.getEntityManager()){
            entityManager.getTransaction().begin();
            entityManager.persist(player);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void removePlayer(int id) throws Exception {
        try(EntityManager entityManager = HibernateUtils.getEntityManager()){
            Player playerById = getPlayerById(id);
            Player playerFromDB = entityManager.find(Player.class, playerById.getId());
                    entityManager.getTransaction().begin();
            entityManager.remove(playerFromDB);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void editPlayer(int i, Player player) throws Exception {

    }
}
