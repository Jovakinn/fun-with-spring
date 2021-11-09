package spring_introduction.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_introduction.model.Companies.Companies;
import java.util.logging.Logger;

@Component("personBean")
public class Person {
    private static final Logger log = Logger.getLogger(Person.class.getName());

    private String firstName;
    private String lastName;
    private Integer age;
    private Companies companies;
    private Pet pet;

    @Autowired
    public Person(Pet pet) {
        log.info("Person bean is created");
        this.pet = pet;
    }

    public Person() {
    }

    public void setPet(Pet pet) {
        log.info("Class Person: set pet");
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", companies=" + companies +
                ", pet=" + pet +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies companies) {
        this.companies = companies;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet() {
        log.info("My lovely pet!");
        pet.say();
    }
}
