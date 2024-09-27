package springaop.demo.proxy;

public class FancyBeanFactory {

    public Object getBean(String beanName){

        if("CustomerService".equals(beanName)){
            return new CustomerServiceProxy();
        }
        return null;
    }

}
