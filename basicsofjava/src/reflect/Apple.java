package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apple {
    private int price;
    protected String color;
    public String name;

    public Apple(){}

    public Apple(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String printMsg(){
        return "name:" + name + ", price:" + price + ", color:" + color;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //正常new对象
        Apple apple1 = new Apple("Apple1", 6666, "red");
        System.out.println("Apple1:" + apple1);
        System.out.println("Apple1: " + apple1.printMsg());

        //使用反射创建对象
        //获取类的Class对象实例，方式1
//        Class cls = Class.forName("reflect.Apple");
//        //根据Class对象实例获取Constructor对象
//        Constructor appleConstructor = cls.getConstructor();
//        //根据Constructor对象的newInstance方法获取反射类对象
//        Object appleObject = appleConstructor.newInstance();
//        //强制类型转换
//        Apple apple2 = (Apple)appleObject;
//        System.out.println("Apple2:" + apple2);
////        System.out.println("Apple2:" + appleObject);
//        System.out.println("Apple2: " + apple2.printMsg());

        //获取类的Class对象实例，方式2
        Class cls = Apple.class;
        
    }
}
