package hibernate;

import hibernate.DAO.Service.EmployeeService;
import hibernate.model.Detail;
import hibernate.model.Employee;
import java.util.logging.Logger;

public class Runner {
    private static final Logger log = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        EmployeeService employeeService =  new EmployeeService();
        Employee employee = new Employee("Jack", "Russel", "IT", 15000);
        Detail detail = new Detail("Kyiv", "+380986505525", "max05012004@gmail.com");
        employee.setEmployeeDetail(detail);
        employeeService.saveEmployee(employee);
    }
}
