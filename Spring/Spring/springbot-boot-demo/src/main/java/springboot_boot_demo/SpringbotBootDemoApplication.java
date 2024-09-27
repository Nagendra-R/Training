package springboot_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springboot_boot_demo.beans.Student;

@SpringBootApplication
public class SpringbotBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbotBootDemoApplication.class, args);
//		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
//		String[] beans = applicationContext.getBeanDefinitionNames();
//		for (String bean:beans){
//			System.out.println(bean);
//		}
//		System.out.println(beans.length);

		Student student = new Student(1,"nag","reddy");
//		System.out.println(student);

//		student.setId(5);
//		System.out.println(student.getId());


	}

}
