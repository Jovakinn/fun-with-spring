package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    private static final Logger log = Logger.getLogger(LoggingAndSecurityAspect.class.getName());

    @Pointcut("execution(public void aop.model.Libraries.StreetLibrary.get*())")
    private void allGetMethodsFromLibraries() {}

    @Pointcut("execution(public void get*())")
    private void allGetMethods() {}

    @Pointcut("allGetMethodsFromLibraries() || allGetMethods()")
    private void allGetMethodsFromLibrariesAndAllGetMethods() {}

    @Before("allGetMethodsFromLibrariesAndAllGetMethods()")
    public void beforeMethod() {
        log.info("Call pointcuts");
    }

    @Before("allGetMethodsFromLibraries()")
    public void beforeGetLoggingAdvice() {
        log.info("All get methods from Libraries");
    }

    @Before("allGetMethods()")
    public void beforeGettingSecurityAdvice() {
        log.info("Checking rights of user.");
    }
}
