package springaop.demo.terms;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("springaop.demo.terms")
@EnableAspectJAutoProxy
public class Config {


}
