package hibernate.DAO.Interfaces;

import hibernate.model.Child;
import java.util.List;

public interface ChildDAO {
    public Child findById(Integer id);
    public void save(Child child);
    public void update(Child child);
    public void delete(Child child);
    public List<Child> findAll();
}
