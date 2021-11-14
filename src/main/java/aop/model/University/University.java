package aop.model.University;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class University {
    private static final Logger log = Logger.getLogger(University.class.getName());
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Maksym Khodakov", 1, 80.0);
        Student student2 = new Student("Michael Ivanov", 2, 75.6);
        Student student3 = new Student("Jack Russel", 3, 60.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        log.info("Information from method getStudents()");
        students.forEach(System.out::println);
        return students;
    }
}
