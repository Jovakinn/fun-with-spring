package hibernate;

import hibernate.DAO.Service.EmployeeService;
import hibernate.model.Department;
import hibernate.model.Detail;
import hibernate.model.Employee;
import java.util.logging.Logger;

public class Runner {
    private static final Logger log = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        EmployeeService employeeService =  new EmployeeService();
        Employee employee = new Employee("George", "Russel",12000);
        Detail detail = new Detail("Kyiv", "+380986505525", "maksymkhodakov@gmail.com");
        Department department = new Department("IT", 7000, 5000);
        employee.setEmployeeDetail(detail);
        employee.setDepartment(department);
        employeeService.saveEmployee(employee);
    }
}
