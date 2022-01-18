//package chapterSix;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class KataTest {
//    Cata cata = new Cata();
//
//    @Test   //Called Annotation
//    public void aGradeCanBeCalculatedTest(){
//        Cata cata = new Cata();
//       char result =  cata.calculateGradeFor(98);
//       assertEquals('A', result);
//    }
//
//    @Test
//    public void bGradeCanBeCalculatedTest(){
//        Cata cata = new Cata();
//        char result = cata.calculateGradeFor(89);
//        assertEquals('B', result);
//    }
//
//    @Test
//    public void cGradeCanBeCalculatedTest(){
//        Cata cata = new Cata();
//        char myResult = cata.calculateGradeFor(79);
//        assertEquals('C', myResult);
//    }
//
//    @Test
//    public void dGradeCanBeCalculatedTest(){
//        Cata cata = new Cata();
//        char myResult = cata.calculateGradeFor(69);
//        assertEquals('D', myResult);
//    }
//
//    @Test
//    public void fGradeCanBeCalculatedTest(){
//        Cata cata = new Cata();
//        char myResult = cata.calculateGradeFor(59);
//        assertEquals('F', myResult);
//    }
//
//    @Test
//    public void newValueEstimate(){
//        Cata cata = new Cata();
//        int newPrice = cata.setPriceFor(4);
//        assertEquals(8000, newPrice);
//    }
//
////    @Test
////    public void ValueEstimate(){
////        int newPrice = Cata.setPriceFor();
////
////    }
//
//    //class exercise
//    @Test
//    public void arraysTotalCanBeCalculatedTest(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = cata.calculateTotalOf(numbers);
//        assertEquals( 15, result);
//    }
//
//    @Test
//    public void arraysMinimumCanBeCalculatedTest(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = cata.calculateMinimumOf(numbers);
//        assertEquals( 1, result);
//    }
//
//    @Test
//    public void arraysMaximumCanBeCalculated(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = cata.calculateMaximumOf(numbers);
//        assertEquals( 5, result);
//    }
//
//    @Test
//    public void arrayAverageCanBeCalculated(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        double result = cata.calculateAverageOf(numbers);
//        assertEquals( 5, result);
//    }
//
//    @Test
//    public void testVargs(){
//        int result = cata.add(2,3223,5455,65657,23,43345,54564,5454,213424,235324,1,342);
////        System.out.println(result);
//        assertEquals(177746, result);
//    }
//
////    Assignment
//
//    @Test
//    public void minOfMinMaxTest(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = cata.calculateOneLastMinOf(numbers);
//        assertEquals(10, result);
//    }
//
//    @Test
//    public void maxOfMaxMinTest(){
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = cata.calculateOneLastMaxOf(numbers);
//        assertEquals(14, result);
//
//    }
//
//}
//
//
//
//// A test is not a test without assertions
//
////