package main.collection;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        for(Map.Entry<String, Integer> entry: hashMap.entrySet())
            System.out.println(entry.getKey());
    }
}
