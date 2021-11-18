package hibernate.DAO.Interfaces;

import hibernate.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public Employee findById(Integer id);
    public void save(Employee employee);
    public void update(Employee employee);
    public void delete(Employee employee);
    public List<Employee> findAll();
}
