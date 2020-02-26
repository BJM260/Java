package main.interfacelambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args){
//        List list = new ArrayList();
//        list.add(1);
//        list.add(5);
//        list.add(2);
//        list.add(4);
//        list.add(3);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        static int number = 0;
//        int number;
//        System.out.println(number);
//        Hero.printName();

//        Hero hero = new SuperMan("Mike");
//        Hero hero2 = new SuperMan("Mike");
//        System.out.println(hero == hero2);
//        System.out.println(hero.equals(hero2));
//
//        String name = "FengShuYing";
//        String name2 = "WuWenFeng";
//        System.out.println(name.equals(name2));
//
//        char c = 'a';
//        Character c2 = new Character('a');
//        int n = 1;
//        System.out.println("FengShuYing".hashCode());
//        Object obj = new Object();

        String a = "FengShuYing~";
        String b = "HeYing~";
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        swap(a, b);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    private static void swap(String s1, String s2){
        String temp = s1;
        s1 = s2;
        s2 = temp;
    }
}
