package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.model.Dog;

public class IOCDI {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext2.xml",
                             "applicationContext2.xml")) {
            Dog myDog = context.getBean("myPet", Dog.class);
            Dog yourDog = context.getBean("myPet", Dog.class);
            myDog.say();
            yourDog.say();
        }
    }

}
