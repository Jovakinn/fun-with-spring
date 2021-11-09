package spring_introduction.model;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("dogBean")
public class Dog implements Pet {
    private static final Logger log = Logger.getLogger(Dog.class.getName());

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        log.info("Dog bean is created");
    }

    @Override
    public void say() {
        log.info("Wof wof");
    }

    public void init() {
        log.info("Class Dog: init method");
    }

    public void destroy() {
        log.info("Class Dog: destroy method");
    }
}
