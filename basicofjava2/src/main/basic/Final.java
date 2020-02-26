package main.basic;

public class Final {
    //静态常量
    public static final double PI = 3.141592654;
    //声明成员常量：作用域类似于成员变量，但不能修改
    final int y = 10;
    public static void main(String[] args){
        //声明局部常量：作用域类似于局部变量，但不能修改
        final double x = 3.3;

        System.out.println("PI:" + PI);
    }
}
