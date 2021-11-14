package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    private static final Logger log = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(public void aop.model.Libraries.StreetLibrary.get*())")
    private void allGetMethodsFromLibraries() {}


    @Pointcut("allGetMethodsFromLibraries() || aop.aspects.MyPointcuts.allGetMethods()")
    private void allGetMethodsFromLibrariesAndAllGetMethods() {}

    @Before("allGetMethodsFromLibrariesAndAllGetMethods()")
    public void beforeMethod() {
        log.info("Get pointcut");
    }

    @Before("allGetMethodsFromLibraries()")
    public void beforeGetLoggingAdvice() {
        log.info("All get methods from Libraries");
    }


}
