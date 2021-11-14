package aop.model.Libraries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class SchoolLibrary implements AbstractLibrary<SchoolLibrary> {
    private static final Logger log = Logger.getLogger(SchoolLibrary.class.getName());

    @Autowired
    private List<Reader> readers;

    public List<Reader> getReaders() {
        return readers;
    }
    @Override
    public void getBooks(SchoolLibrary library) {
        if (library.getReaders() == null) {
            log.info("No readers in library! It's 21st century!");
        } else {
            library.getReaders()
                    .forEach(System.out::println);
        }
    }

    public void returnAmountOfReaders(){
        readers.size();
    }
}
