package hibernate.DAO.Service;

import hibernate.DAO.Impls.ChildDAOImpl;
import hibernate.DAO.Impls.EmployeeDAOImpl;
import hibernate.model.Child;
import hibernate.model.Employee;

import java.util.List;

public class ChildService {
    private ChildDAOImpl childDAO = new ChildDAOImpl();

    public ChildService() {}

    public Child findChildById(Integer id) {
        return childDAO.findById(id);
    }

    public void saveChild(Child child) {
        childDAO.save(child);
    }

    public void deleteChild(Child child) {
        childDAO.delete(child);
    }

    public void updateChild(Child child) {
        childDAO.update(child);
    }

    public List<Child> findAllChildren() {
        return childDAO.findAll();
    }
}
