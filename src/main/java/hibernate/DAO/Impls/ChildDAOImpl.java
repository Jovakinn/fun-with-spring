package hibernate.DAO.Impls;

import hibernate.DAO.Interfaces.ChildDAO;
import hibernate.model.Child;
import hibernate.model.Employee;
import hibernate.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ChildDAOImpl implements ChildDAO {
    @Override
    public Child findById(Integer id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Child.class, id);
    }

    @Override
    public void save(Child child) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(child);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Child child) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(child);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Child child) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(child);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Child> findAll() {
        return (List<Child>) HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("From Child ").list();
    }
}
