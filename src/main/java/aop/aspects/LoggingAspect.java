package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger log = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* aop.model.Library.getBooksOfUsers())")
    public void beforeGetBooksOfUsersAdvice() {
        log.info("getting access to library");
    }
}
