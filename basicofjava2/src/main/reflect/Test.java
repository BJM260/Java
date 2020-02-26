package main.reflect;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException{
        Integer number = new Integer(1);
        System.out.println(number.getClass());
        System.out.println(Class.forName("Test"));
        System.out.println(Integer.class);
    }
}
