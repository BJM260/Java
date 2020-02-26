package main.genericity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRewrite<E> {
    private int size = 0;
    private Object[] elements = null;
    private int curElement = 0;

    public ArrayListRewrite(){
        this.size = 10;
        createList(size);
    }

    public ArrayListRewrite(int size){
        this.size = size;
        createList(size);
    }

    private void createList(int size){
        this.elements = new Object[size];
    }

    public void addValue(E e){
        if(e == null)
            return;
        if(curElement >= elements.length)
            this.elements = reCreateList(size + size / 2);
        elements[curElement++] = e;
        return;
    }

    public Object getValue(int key){
        return elements[key];
    }

    private Object[] reCreateList(int size){
        if(size == 0)
            return null;
        Object[] temp = new Object[size];
        for(int i = 0; i < elements.length; ++i)
            temp[i] = elements[i];
        return temp;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);

        ArrayListRewrite<Integer> list2 = new ArrayListRewrite<>();
        list2.addValue(1);
        System.out.println(list2.getValue(0));
//        System.out.println(list2.toString());
    }
}
