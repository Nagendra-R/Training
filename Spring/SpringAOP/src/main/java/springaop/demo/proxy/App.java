package springaop.demo.proxy;

public class App {
    public static void main(String[] args) {

        FancyBeanFactory beanFactory = new FancyBeanFactory();
        CustomerService customerService = (CustomerService) beanFactory.getBean("CustomerService");
        customerService.doSomething();



    }
}
