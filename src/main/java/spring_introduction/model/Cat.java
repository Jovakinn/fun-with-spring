package spring_introduction.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component("catBean")
@Scope("singleton")
public class Cat implements Pet {
    private static final Logger log = Logger.getLogger(Cat.class.getName());

    public Cat() {
        log.info("Cat bean is created");
    }

    @Override
    public void say() {
        log.info("Mew mew");
    }
}
