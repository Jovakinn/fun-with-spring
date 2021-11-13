package aop;

import aop.config.ConfigForAOP;
import aop.model.Libraries.StreetLibrary;
import aop.model.Reader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class)) {

            StreetLibrary library = context.getBean("library", StreetLibrary.class);
            Reader reader = context.getBean("reader", Reader.class);
            List<Reader> listReaders = new ArrayList<>();

            listReaders.add(reader);
            library.setReaders(listReaders);
            library.getBooks(library);
        }
    }
}
