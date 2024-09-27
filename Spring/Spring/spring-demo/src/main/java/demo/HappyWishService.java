package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Primary
public class HappyWishService implements WishService{

    @Override
    public String getWish() {
        return "good luck for the match";
    }
}
