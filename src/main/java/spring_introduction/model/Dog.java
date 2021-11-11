package spring_introduction.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component("dogBean")
@Scope("singleton")
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

    @PostConstruct
    public void init() {
        log.info("Class Dog: init method");
    }

    @PreDestroy
    public void destroy() {
        log.info("Class Dog: destroy method");
    }
}
