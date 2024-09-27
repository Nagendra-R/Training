package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCricketCoach")
public class CricketCoach implements Coach {
//    @Autowired
    private WishService wishService;
    private String email;

    @Autowired
    public CricketCoach(@Qualifier("happyWishService") WishService wishService) {
        this.wishService = wishService;
    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public WishService getWishService() {
        return wishService;
    }

//    @Autowired
//    public void setWishService(WishService wishService) {
//        this.wishService = wishService;
//    }

    public String getDailyWorkOut() {
        return "Batting practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }

    @PostConstruct
    public void startUpMethod() {
        System.out.println("start");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroy");
    }
}
