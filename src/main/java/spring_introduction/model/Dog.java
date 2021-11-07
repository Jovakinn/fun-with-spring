package spring_introduction.model;

import java.util.logging.Logger;

public class Dog implements Pet {
    private static final Logger log = Logger.getLogger(Dog.class.getName());

    @Override
    public void say() {
        log.info("Wof wof");
    }
}
