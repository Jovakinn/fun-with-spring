package spring_introduction.model;

import java.util.logging.Logger;

public class Cat implements Pet {
    private static final Logger log = Logger.getLogger(Cat.class.getName());

    @Override
    public void say() {
        log.info("Mew mew");
    }
}
