package innerclass;

public class OuterClass2 {
    private String sex;
    public static String name = "wolf";

    /**
     * 静态内部类
     */
    static class InnerClass1{
        //在静态内部类中可以存在静态成员
        public static String name1 = "wolf_static";

        public void display(){
            /*
            静态内部类只能访问外围类的静态成员变量和方法，不能访问外围类的非静态成员变量和方法
             */
            System.out.println("OutClass name:" + name);
        }
    }

    /**
     * 非静态内部类
     */
    class InnerClass2{
        //非静态内部类中不能存在静态成员
        public String name2 = "wolf_inner";
        //非静态内部类中可以调用外围类的任何成员，不管是静态的还是非静态的
        public void display(){
            System.out.println("OuterClass name:" + name);
        }
    }

    public void display(){
        //外围类访问静态内部类：内部类
        System.out.println(InnerClass1.name1);
        //静态内部类可以直接创建实例不需要依赖于外围类
        new InnerClass1().display();
        //非静态内部类的创建需要依赖于外围类
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2().new InnerClass2();
        //访问非静态内部类的成员需要使用非静态内部类的实例
        System.out.println(innerClass2.name2);
        innerClass2.display();
    }

    public static void main(String[] args){
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();
    }
}
