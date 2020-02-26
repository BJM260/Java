package main.genericity;

public class A1 extends Apple<String> {
    //正确重写了父类的方法，返回值
    //与父类Apple<String>的返回值完全相同
    public String getInfo(){
        return "sonOfClass" + super.getInfo();
    }
    //下面方法是错误的，重写父类的方法时返回值类型不一致
//    public Object getInfo(){
//        return "sonOfClass";
//    }
}
