package aop.model.Libraries;

import aop.model.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary<SchoolLibrary> {
    @Override
    public void getBooks(SchoolLibrary library) {
        library.getBooks(library);
    }
}
