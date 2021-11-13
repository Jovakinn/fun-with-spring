package aop;

import aop.config.ConfigForAOP;
import aop.model.Libraries.StreetLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class)) {

            StreetLibrary library = context.getBean("library", StreetLibrary.class);
            library.getBooks(library);
        }
    }
}
