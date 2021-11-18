package hibernate;

import hibernate.DAO.Service.EmployeeService;
import hibernate.model.Employee;
import java.util.logging.Logger;

public class Runner {
    private static final Logger log = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = new Employee("Max", "Khodakov", "IT", 1200);
        employeeService.saveEmployee(employee);
        employee.setSalary(77777);
        employeeService.updateEmployee(employee);
        log.info(String.valueOf(employeeService.findAllEmployees()));
    }
}
