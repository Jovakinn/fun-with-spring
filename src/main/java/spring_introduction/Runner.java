package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.config.ConfigClass;
import spring_introduction.model.Person;

public class Runner {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(ConfigClass.class);
            Person person = context.getBean("personBean", Person.class);
            person.callYourPet();

            context.close();
    }
}
