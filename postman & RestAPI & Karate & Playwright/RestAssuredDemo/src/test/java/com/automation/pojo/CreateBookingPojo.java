package com.automation.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateBookingPojo {
    String firstname;
    String lastname;
    String totalprice;
   private boolean depositpaid;
    BookingDate bookingdates;
    String additionalneeds;

}
