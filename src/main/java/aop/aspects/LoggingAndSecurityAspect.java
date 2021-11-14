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

    @Pointcut("execution(public void get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGettingAdvice() {
        log.info("getting access to library");
    }

    @Before("allGetMethods()")
    public void beforeGettingSecurityAdvice() {
        log.info("Checking rights of user.");
    }
}
