package aop;

import aop.config.ConfigForAOP;
import aop.model.Book;
import aop.model.Libraries.SchoolLibrary;
import aop.model.Libraries.StreetLibrary;
import aop.model.Reader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigForAOP.class)) {

            StreetLibrary streetLibrary = context.getBean("streetLibrary", StreetLibrary.class);
            Reader reader1 = context.getBean("reader", Reader.class);
            Reader reader2 = context.getBean("reader", Reader.class);
            Reader reader3 = context.getBean("reader", Reader.class);
            Book book = context.getBean("book", Book.class);
            reader1.setBook(book);
            reader2.setBook(book);
            reader3.setBook(book);
            List<Reader> readers = new ArrayList<>();
            readers.add(reader1);
            readers.add(reader2);
            readers.add(reader3);
            streetLibrary.setReaders(readers);
            streetLibrary.getBooks(streetLibrary);

            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
            schoolLibrary.getBooks(schoolLibrary);
        }
    }
}
