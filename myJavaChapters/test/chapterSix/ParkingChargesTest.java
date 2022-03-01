package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges charges;
    @BeforeEach
    public void setUp(){
        charges = new ParkingCharges();
    }

    @Test
    public void parkChargesTwoDollarsMinForThreeHoursTest(){
        assertEquals(charges.minChargesInThreeHour(), 2.00);
    }

    @Test
    public void parkChargesHalfADollarPerHourAfterThreeHoursTest(){
        charges.minChargesInThreeHour();
        assertEquals(charges.afterThreeHoursCharge(), 0.50);
    }

    @Test
    public void parkChargesTenDollarAfterTwentyFourHourTest(){
        charges.minChargesInThreeHour();
        charges.afterThreeHoursCharge();
        assertEquals(charges.maxChargeInTwentyFourHour(), 10.00);
    }

}