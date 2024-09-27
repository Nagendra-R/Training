package demo;


import org.springframework.stereotype.Component;

@Component
public class BadWishService implements WishService{
    @Override
    public String getWish() {
        return "Bad wish";
    }
}
