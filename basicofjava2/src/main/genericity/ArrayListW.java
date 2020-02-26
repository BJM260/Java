package main.genericity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListW<E> {
    private Object[] elements;
    public ArrayListW(){
        elements = (E[])new Object[10];
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
    }
}
