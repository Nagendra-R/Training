package springaop.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springaop.demo.terms.Config;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = context.getBean(CustomerService.class);

        customerService.doSomething();

    }
}
