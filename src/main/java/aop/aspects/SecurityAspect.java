package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    private static final Logger log = Logger.getLogger(SecurityAspect.class.getName());

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGettingSecurityAdvice() {
        log.info("Checking rights of user.");
    }
}
