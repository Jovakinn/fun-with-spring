package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(public void getBooks())")
    public void allGetMethods() {}
}
