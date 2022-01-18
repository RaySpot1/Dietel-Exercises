//package AirCondition;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AirConTest {
//    @BeforeEach
//    public void beforeEachMethod(){
//       AirCon ac = new AirCon();
//    }
//    private AirCon ac = new AirCon("On", "Off", "Cold", "Colder", "lessCold", "Hot", "Hotter", "lessHot");
//
//    @Test
//    public void AcCanBeTurnedOnTest(){
//        String turnOn = ac.getAcOnStatus();
//        assertEquals("On", turnOn);
//
//    }
//
//    @Test
//    public void AcCanBeTurnedOffTest(){
//        String turnOff = ac.getAcOffStatus();
//        assertEquals("Off", turnOff);
//    }
//
//    @Test
//    public void acColdTemperatureTest(){
//        String coldTemperature = ac.getColdTemperatureStatus();
//        assertEquals("Cold", coldTemperature);
//    }
//
//    @Test
//    public void coldTemperatureIncrementTest(){
//        ac.coldIncrement(true);
//        assertEquals(ac.getColdTemperatureStatus(), "cold");
//    }
//
//    @Test
//    public void acHotTemperatureTest(){
//        String hotTemperature = ac.getHotTemperatureStatus();
//        assertEquals("Hot", hotTemperature);
//    }
//
//    @Test
//    public void increaseAcOver30Test(){
//        int over30 = ac.increaseOver30(1000);//always return 30 no matter the number
//        assertEquals(30, over30);
//    }
//}
