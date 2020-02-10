package genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    //泛型：“参数化类型”    parameterized type
    public static void main(String[] args){
        //创建一个只想保存字符串的List集合，此处声明的List是带有类型参数的泛型接口，所以只能add，List声明的类型，add其他类型会发生编译异常
        List<String> strList = new ArrayList<>();
        //           0 123456 7
        strList.add("疯狂Java讲义");
        strList.add("疯狂Android讲义");
        //下面代码将引起编译错误
//        strList.add(5);
        strList.forEach(str -> System.out.println(str.length()));
    }
}
