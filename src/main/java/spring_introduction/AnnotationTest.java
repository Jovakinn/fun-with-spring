package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.model.Person;

import java.util.logging.Logger;

public class AnnotationTest {
    private static final Logger log = Logger.getLogger(AnnotationTest.class.getName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        log.info(String.valueOf(person));

        context.close();
    }
}
