package aop.aspects;


import aop.model.University.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Aspect
public class UniversityLoggingAspect {
    private static final Logger log  = Logger.getLogger(UniversityLoggingAspect.class.getName());

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        log.info("Logging getting students before getStudents()");
    }

    /**
     * Using after returning to redefine some parameters of first student
     * @param students
     */
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        Double avgGrade = firstStudent.getAverageGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAverageGrade(avgGrade);

        log.info("Logging getting students after getStudents()");
    }
}
