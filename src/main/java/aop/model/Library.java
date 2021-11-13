package aop.model;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.logging.Logger;

@Component("library")
public class Library {
    private List<Reader> readers;
    private static final Logger log = Logger.getLogger(Library.class.getName());

    public List<Reader> getReaders() {
        return readers;
    }

    public Library() {
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public Library(List<Reader> readers) {
        this.readers = readers;
    }

    public static void getBooksOfUsers(Library library) {
        if (library.getReaders() == null) {
            log.info("No readers in library! It's 21st century!");
        } else {
            library.getReaders()
                    .forEach(System.out::println);
        }
    }
}
