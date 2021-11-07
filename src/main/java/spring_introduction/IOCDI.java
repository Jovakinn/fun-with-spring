package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.model.Dog;

public class IOCDI {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext2.xml",
                             "applicationContext2.xml")) {
            Dog myDog = context.getBean("myPet", Dog.class);
            myDog.setName("Jackie");
            Dog yourDog = context.getBean("myPet", Dog.class);
            yourDog.setName("Boomer");

            System.out.println(myDog.getName());
            System.out.println(yourDog.getName());
        }
    }

}
