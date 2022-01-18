//package BikeApp;
//
//import chapterSeven.Bike;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class BikeTest {
//    Bike bike = new Bike("Lamborghini");
//
//    @Test
//    public void bikeCanBeTurnedOnTest(){
//
//       bike.turnOn();
//       assertTrue(bike.isOn());
//    }
//
//    @Test
//    public void bikeCanBeTurnedOffTest(){
//       bike.turnOff();
//       assertFalse(bike.isOn());
//    }
//
//    @Test
//    public void bikeCanAccelerateByGearOne(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(1);
//        }
//        assertEquals(4, bike.getSpeed());
//    }
//
//    @Test
//   public void bikeCanAccelerateByGearTwoTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(2);
//        }
//        assertEquals(8, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanAccelerateByGearThreeTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(3);
//        }
//        assertEquals(12, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanAccelerateByGearFourTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(4);
//        }
//        assertEquals(16, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanDecelerateByGearOneTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(1);
//        }
//        bike.decelerate(1);
//        assertEquals(3, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanDecelerateByGearTwoTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 0
//            ; i < 5; i++){
//            bike.accelerate(1);
//        }
//        bike.decelerate(2);
//        assertEquals(3, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanDecelerateByGearThreeTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(3);
//        }
//        bike.decelerate(3);
//        assertEquals(9, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeCanDecelerateByGearFourTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 5; i++){
//            bike.accelerate(4);
//        }
//        bike.decelerate(4);
//        assertEquals(12, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeSpeedCannotBeNegativeTest(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        for(int i = 1; i < 6; i++){
//            bike.accelerate(1);
//        }
//        assertEquals(0, bike.getSpeed());
//    }
//
//    @Test
//    public void bikeIsInGear1Test(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//        bike.accelerate(4);
//
//        assertEquals(4, bike.getSpeed());
//        bike.setGear();
//        assertEquals(1, bike.getGear());
//    }
//
//    @Test
//    public void bikeIsInGear2Test(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//        for(int i = 1; i < 7; i++){
//            bike.accelerate(4);
//        }
//
//        assertEquals(24, bike.getSpeed());
//        bike.setGear();
//        assertEquals(2, bike.getGear());
//    }
//
//    @Test
//    public void bikeIsInGear3Test(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//        for(int i = 1; i < 11; i++){
//            bike.accelerate(4);
//        }
//
//        assertEquals(40, bike.getSpeed());
//        bike.setGear();
//        assertEquals(3, bike.getGear());
//    }
//
//    @Test
//    public void bikeIsInGear4Test(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//        for(int i = 1; i < 12; i++){
//            bike.accelerate(4);
//        }
//
//        assertEquals(44, bike.getSpeed());
//        bike.setGear();
//        assertEquals(4, bike.getGear());
//    }
//
//    @Test
//    public void checkGearWhenOffTest(){
//        bike.turnOff();
//        assertFalse(bike.isOn());
//        bike.setGear();
//        assertEquals(0, bike.getGear());
//    }
//
//    @Test
//    public void checkToStringTest(){
//        bike.turnOn();
//        assertFalse(bike.isOn());
//        bike.accelerate(2);
//        assertEquals(2, bike.getGear());
//        bike.setGear();
//        assertEquals(1, bike.getGear());
//        bike.toString();
//        System.out.println(bike);
//    }
//}
