package demo;


import org.springframework.stereotype.Component;

@Component("myFootBallCoach")
public class FootBallCoach implements Coach {
    private WishService wishService;
    public String getDailyWorkOut(){
        return "FootBall practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }
}
