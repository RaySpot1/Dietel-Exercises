//package Television;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TvTest {
//
//   private Tv tv = new Tv("On", "Off", "Volume Up", "Volume Down", "New Channel");
//
//   @Test
//   public void tvCanBeTurnedOnTest(){
//      String TvOn = tv.getTvOnStatus();
//      assertEquals("On",TvOn);
//   }
//
//   @Test
//   public void tvCanBeTurnedOffTest(){
//      String TvOff = tv.getTvOffStatus();
//      assertEquals("Off", TvOff);
//   }
//
//   @Test
//   public void turnUpVolumeTest(){
//      String volumeIncreased = tv.getVolumeUpStatus();
//      assertEquals("Volume Up", volumeIncreased);
//   }
//
//   @Test
//   public void turnDownVolumeTest(){
//      String volumeDecreased = tv.getVolumeDownStatus();
//      assertEquals("Volume Down", volumeDecreased);
//   }
//
//}
