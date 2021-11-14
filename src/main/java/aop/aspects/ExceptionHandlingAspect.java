package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    private static final Logger log = Logger.getLogger(ExceptionHandlingAspect.class.getName());

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] arguments = joinPoint.getArgs();

        log.info("Method signature: " + methodSignature);
        log.info("Method signature.getMethod().getName = " +
                methodSignature.getMethod().getName());
        log.info("Arguments: " + Arrays.toString(arguments));
        log.info("Catch and handle exceptions");
    }
}
