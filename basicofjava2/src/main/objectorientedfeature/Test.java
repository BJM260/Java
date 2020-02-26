package main.objectorientedfeature;

public class Test {
    public static void main(String[] args){
//        //定义父类数组
//        Wine[] wines = new Wine[2];
//        //定义两个子类
//        JNC jnc = new JNC();
//        JGJ jgj = new JGJ();
//
//        //父类引用子类对象
//        wines[0] = jnc;
//        wines[1] = jgj;
//
//        for(int i = 0; i < 2; ++i)
//            System.out.println(wines[i].toString() + "--" + wines[i].drink());

        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1." + a1.show(b));
        System.out.println("2." + a1.show(c));
        System.out.println("3." + a1.show(d));
        System.out.println("4." + a2.show(b));
        System.out.println("5." + a2.show(c));
        System.out.println("6." + a2.show(d));
        System.out.println("7." + b.show(b));
        System.out.println("8." + b.show(c));
        System.out.println("9." + b.show(d));
    }
}
