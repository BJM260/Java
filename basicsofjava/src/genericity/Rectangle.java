package genericity;

import java.awt.*;

/**
 * 定义Shape的子类Rectangle
 */
public class Rectangle extends Shape {
    //实现画图方法，以打印字符串来模拟画图方法实现
    public void draw(Canvas canvas){
        System.out.println("把一个矩形画在画布" + canvas + "上");
    }
}
