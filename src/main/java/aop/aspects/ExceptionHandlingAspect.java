package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    private static final Logger log = Logger.getLogger(ExceptionHandlingAspect.class.getName());

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        log.info("Catch and handle exceptions");
    }
}
