package aop;

import aop.config.ConfigForAOP;
import aop.model.Libraries.SchoolLibrary;
import aop.model.Libraries.StreetLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class)) {

            StreetLibrary streetLibrary = context.getBean("streetLibrary", StreetLibrary.class);
            streetLibrary.getBooks(streetLibrary);
            streetLibrary.getReaders();

            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
            schoolLibrary.getBooks(schoolLibrary);
            schoolLibrary.getReaders();
        }
    }
}
