package springaop.demo.terms;


import org.springframework.stereotype.Component;

//manage the beans ---> src
@Component
public class CustomerServiceImpl implements CustomerService{

    @Override
    public void doSomething() {
        System.out.println(" do something in Implemented method");
    }
}
