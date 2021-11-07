package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.model.Cat;

public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        context.close();
    }
}
