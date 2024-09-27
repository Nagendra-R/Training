package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        //tight coupling
//        left side
//        CricketCoach cricketCoach = new CricketCoach();
//        System.out.println(cricketCoach.getDailyWorkOut());

        // coach.FootBallCoach footBallCoach = new coach.FootBallCoach();
//        System.out.println(footBallCoach.getDailyWorkOut());

//        Coach coach = new CricketCoach();
//        System.out.println(coach.getDailyWorkOut());
//        Coach coach1 = new FootBallCoach();
//        System.out.println(coach1.getDailyWorkOut());

//        CricketCoach coach = new CricketCoach();
//        coach.setWishService(new HappyWishService());
//        System.out.println(coach.getDailyWorkOut());
//        System.out.println(coach.getDailyWish());

//        singleTon--> only one bean is created in  spring context/container


//
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach);
        System.out.println(coach.getDailyWish());

//        System.out.println(coach.getDailyWorkOut());
//        System.out.println(coach.getDailyWish());
//        System.out.println(coach.getEmail());


        context.close();
    }
}



//parent ->override
