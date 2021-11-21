package hibernate.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_salary")
    private Integer maxSalary;

    @Column(name = "min_salary")
    private Integer minSalary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(String departmentName, Integer maxSalary, Integer minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                ", employeeList=" + employeeList +
                '}';
    }

    public void addEmployeeToDepartment(Employee employee) {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
        employee.setDepartment(this);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
