package main.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 9的“菱形”语法：允许创建匿名内部类时使用菱形语法，Java可根据上下文来推断匿名内部类中泛型的类型
 */
public class AnnoymousTest {
    public static void main(String[] args){
        //指定Foo类中泛型为String
//        Foo<String> f = new Foo<>(){
//            //test()方法的参数类型为String
//            public void test(String t){
//                System.out.println("test方法的t参数为:" + t);
//            }
//        };

        //使用泛型通配符，此时相当于通配符的上限为Object
//        Foo<?> fo = new Foo<>(){
//            //test()方法的参数类型为Object
//            public void test(Object t){
//                System.out.println("test方法的Object参数为:" + t);
//            }
//        };

        //使用泛型通配符，通配符的上限为Number
//        Foo<? extends Number> fn = new Foo<>(){
//            //此时test()方法的参数类型为Number
//            public void test(Number t){
//                System.out.println("test方法的Number参数为:" + t);
//            }
//        };

        List<?> c = new ArrayList<String>();
        //下一行代码引起编译错误，原因：程序无法确定c集合中元素的类型，但是null可以add，因为null是所有引用类型的实例
        c.add(null);
    }

    public void test(List<?> c){
        for(int i = 0; i < c.size(); ++i)
            System.out.println(c.get(i));
    }
}
