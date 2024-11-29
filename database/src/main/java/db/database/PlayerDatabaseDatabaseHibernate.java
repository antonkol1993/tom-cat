package db.database;

import db.IPlayerDatabase;
import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
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
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
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
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            List<Player> players = entityManager.createQuery("from Player").getResultList();
            return players;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Player getPlayerById(Integer id) {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            return entityManager.find(Player.class, id);
        }
    }

    @Override
    public void addPlayer(Player player) throws Exception {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(player);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Something is wrong!!! ");
        }
    }

    @Override
    public void removePlayer(int id) throws Exception {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            Player playerById = getPlayerById(id);
            Player playerFromDB = entityManager.find(Player.class, playerById.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(playerFromDB);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Something is wrong!!! ");
        }
    }

    @Override
    public void editPlayer(int id, Player player) throws Exception {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            Player playerById = getPlayerById(id);
            assert playerById !=null;
            playerById.setName(player.getName());
            playerById.setAge(player.getAge());
            playerById.setCountry(player.getCountry());
            playerById.setPosition(player.getPosition());
            playerById.setRating(player.getRating());
            entityManager.getTransaction().begin();
            entityManager.merge(playerById);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Something is wrong!!! ");
        }

    }




}
