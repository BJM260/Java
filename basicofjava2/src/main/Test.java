package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    //必须在构造函数中初始化不然会出错
    private final String name;

    @Override
    public String toString(){
        return name;
    }

    public Test(){
        this.name = "FengShuYing~";
    }

    public static void main(String[] args) throws Exception{
        Test test = new Test();
        System.out.println(test.toString().toLowerCase());

        StringBuilder sb = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello~");
    }
}
