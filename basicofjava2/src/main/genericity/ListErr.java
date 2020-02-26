package main.genericity;

import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args){
        //创建一个只想保存字符串的List集合
        List strList = new ArrayList();
        //           1 234567 8
        strList.add("疯狂Java讲义");
        strList.add("疯狂Android讲义");

        //"不小心"往strList中add了一个Integer对象
        strList.add(5);
        strList.forEach(str -> System.out.println(((String)str).length())); //抛出ClassCastException，由于Integer转String
    }
}
