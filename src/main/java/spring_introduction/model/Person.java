package spring_introduction.model;

import java.util.logging.Logger;

public class Person {
    private static final Logger log = Logger.getLogger(Person.class.getName());

    private Pet pet;

    public Person(Pet pet) {
        log.info("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        log.info("My lovely pet!");
        pet.say();
    }
}
