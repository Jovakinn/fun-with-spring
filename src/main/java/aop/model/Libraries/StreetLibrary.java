package aop.model.Libraries;

import aop.model.AbstractLibrary;
import aop.model.Reader;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.logging.Logger;

@Component("library")
public class StreetLibrary implements AbstractLibrary<StreetLibrary> {
    private List<Reader> readers;
    private static final Logger log = Logger.getLogger(StreetLibrary.class.getName());

    public List<Reader> getReaders() {
        return readers;
    }

    public StreetLibrary() {
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public StreetLibrary(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public void getBooks(StreetLibrary library) {
        if (library.getReaders() == null) {
            log.info("No readers in library! It's 21st century!");
        } else {
            library.getReaders()
                    .forEach(System.out::println);
        }
    }
}
