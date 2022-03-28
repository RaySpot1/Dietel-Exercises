package chapter14;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils("test");
        System.out.println(utils._count('t'));
        System.out.println(utils._lastIndexOf('t'));
        System.out.println(utils._indexOf('T'));
    }
}
