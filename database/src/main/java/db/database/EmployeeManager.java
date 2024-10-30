package db.database;

import objects.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Properties;

public class EmployeeManager {

    public Session getSession() {

        try (SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()) {
            return sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Person> getAllPerson() {
        try (Session session = getSession()) {
            Query<Person> query = session.createQuery("from Person", Person.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    public void addEmployee(Employee employee ) {
//        try (Session session = sessionFactory.openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.save(employee);
//            transaction.commit();
//        }
//    }


//    private static class SessionFactory {
//        public Session openSession() {
//            Configuration configuration = new Configuration();
//            Properties properties = new Properties();
//
//            properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
//            properties.put(Environment.URL,"jdbc:mysql://localhost:3306/hiber_demo");
//            properties.put(Environment.USER,"root");
//            properties.put(Environment.PASS,"root");
//            SessionFactory sessionFactory = (SessionFactory) new Configuration()
//                    .setProperties(properties)
//                    .addAnnotatedClass(by.education.objects.Person.class)
//                    .buildSessionFactory();
//            return sessionFactory.openSession();
//        }
//
//    }

}
