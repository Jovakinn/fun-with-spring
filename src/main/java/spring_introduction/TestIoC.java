package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.model.Person;

import java.util.logging.Logger;

public class TestIoC {
    private static final Logger log = Logger.getLogger(TestIoC.class.getName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
       log.info(person.toString());

        context.close();
    }

}
