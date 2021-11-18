package hibernate.DAO.Service;

import hibernate.DAO.Impls.EmployeeDAOImpl;
import hibernate.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    public EmployeeService() {}

    public Employee findEmployeeById(Integer id) {
        return employeeDAO.findById(id);
    }

    public void saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeDAO.delete(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeDAO.update(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeDAO.findAll();
    }
}
