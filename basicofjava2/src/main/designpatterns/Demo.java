package main.designpatterns;

public class Demo {
    private static int a = 1;
    private static class Inner{
        static{
            System.out.println("Inner loading...");
        }
    }

    public static void main(String[] args){
        System.out.println(Demo.a);
    }
}
