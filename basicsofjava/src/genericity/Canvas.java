package genericity;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    //同时在画布上绘画多个形状
    public void drawAll(List<? extends Shape> shapeList){
        for(Shape shape: shapeList)
            shape.draw(this);
    }

    public void addRectangle(List<? extends Shape> shapes){
        //下边代码引起编译错误
//        shapes.add(0, new Rectangle());
    }

    public static void main(String[] args){
        List<Circle> circles = new ArrayList<>();
        Canvas c = new Canvas();
        c.drawAll(circles);
    }
}
