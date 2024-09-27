package springaop.demo.terms;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))")
    public void logAfter(){
        System.out.println("log before...");
    }

}
