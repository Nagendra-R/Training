package demo;

public class SwimCoach implements Coach{

    private WishService wishService;

    public SwimCoach(WishService wishService) {
        this.wishService = wishService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swimming Practie";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }
}
