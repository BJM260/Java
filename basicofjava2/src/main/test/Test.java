package main.test;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Test {
    static Unsafe unsafe;

    static{
        //获取Unsafe对象
        try{
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe)field.get(null);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static class C1{
        private String name;

        private C1(){
            System.out.println("C1 default constructor~");
        }

        private C1(String name){
            this.name = name;
            System.out.println("C1 有参 constructor~");
        }

        public void test(){
            System.out.println("执行了test方法~");
        }
    }

    public static void main(String[] args) throws InstantiationException {
        C1 c1 = (C1)unsafe.allocateInstance(C1.class);
        System.out.println(c1);
        c1.test();
    }
}
