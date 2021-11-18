package hibernate;

import hibernate.DAO.Service.EmployeeService;
import hibernate.model.Employee;

public class Runner {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = new Employee("Max", "Khodakov", "IT", 1200);
        employeeService.saveEmployee(employee);
    }
}
