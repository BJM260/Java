package main.genericity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java 7的"菱形"语法: 省略new对象时<>中的类型参数
 */
public class DiamondTest {
    public static void main(String[] args){
        //Java 自动推断出ArrayList的<>中应该是String
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("LazyGoal");
        //遍历strList集合，集合元素就是String类型
        strList.forEach(temp -> System.out.println(temp));
        //Java自动推断出HashMap的<>里应该是String, List<String>
        Map<String, List<String>> schoolInfo = new HashMap<>();
        //Java自动推断出ArrayList的<>里应该是String
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolInfo.put("孙悟空", schools);
        //遍历Map时，Map的key是String类型，value是List<String>类型
        schoolInfo.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
