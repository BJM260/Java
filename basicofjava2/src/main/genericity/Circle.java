package main.genericity;

import java.awt.*;

/**
 * 定义一个抽象类Shape
 */
public class Circle extends Shape {
    //实现画图方案，以打印字符串来模拟画图方法实现
    public void draw(Canvas canvas){
        System.out.println("在画布" + canvas + "上画个圆");
    }
}
