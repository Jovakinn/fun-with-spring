package aop;

import aop.config.ConfigForAOP;
import aop.model.University.Student;
import aop.model.University.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class GhostRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);

        context.close();
    }
}
