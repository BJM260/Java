package genericity;

import java.util.ArrayList;
import java.util.List;

public class R<T> {
    //错误实例，不能在静态变量声明中使用泛型形参，原因请参见下面说明
//    static T info;
    T age;
//    public void foo(T msg){
//
//    }
    //错误实例，不能在静态方法声明中使用泛型形参，原因请参见下面说明
//    public static void bar(T msg){
//
//    }

    /**
     * 不管泛型形参传入的是哪一种类型实参，对Java，它们依然被当成同一个类处理，内存中也只占用一块内存空间；
     * 因此在静态方法、静态初始化块或者静态变量的声明和初始化中不允许使用泛型形参
     * 原因：①泛型在对象创建时才知道类型，而静态方法属于类，类在编译阶段就存在，所以虚拟机根本不知道静态***中引用的泛型的类型
     *     ②初始化时：对象创建的代码执行先后顺序是static的部分，然后才是构造函数等等，所以在对象初始化之前static的部分已经执行了，如果你在静态部分引用的泛型，那么毫无疑问虚拟机根本不知道是什么东西
     * @param args
     */
    public static void main(String[] args){
        //创建List<String>对象和List<Integer>对象
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //比较list1对象和list2对象
//        System.out.println(list1.getClass() == list2.getClass());   //true

//        java.util.Collection<String> cs = new java.util.ArrayList<>();
        //系统中并不会真正的生成泛型类，因此instanceof运算符后不能使用泛型类
//        if(cs instanceof java.util.ArrayList<String>){ }
        Integer[] integers = new Integer[10];
        Number[] number = integers;
//        Number[] number = new Number[10];
//        number[0] = 1;
//        number[1] = 0.1;
        number[0] = 1;
        number[1] = 0.1;
        System.out.println(number[0] + "," + number[1]);
    }

    public void test(List list){
        for(int i = 0; i < list.size(); ++i)
            System.out.println(list.get(i));
    }
}
