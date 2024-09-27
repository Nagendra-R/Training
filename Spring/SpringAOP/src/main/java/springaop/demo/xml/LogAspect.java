package springaop.demo.xml;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {

    @After("execution(* *(..))")
    public void logAfter(){
        System.out.println("log after...");
    }

}
