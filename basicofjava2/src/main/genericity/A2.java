package main.genericity;

public class A2 extends Apple {
    //重写父类的方法
    public String getInfo(){
        //super.getInfo()返回值是Object，所以需要用toString
        return super.getInfo().toString();
    }
}
