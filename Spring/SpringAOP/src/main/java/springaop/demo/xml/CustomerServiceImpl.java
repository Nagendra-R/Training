package springaop.demo.xml;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//manage the beans ---> src
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void doSomething() {
        System.out.println(" do something in Implemented method");
    }
}
