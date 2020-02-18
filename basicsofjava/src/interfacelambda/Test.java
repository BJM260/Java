package interfacelambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
