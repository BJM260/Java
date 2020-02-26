package main.objectorientedfeature;

public class JNC extends Wine {
    public JNC(){
        setName("JNC");
    }

    /**
     * 重写父类方法，实现多态
     * @return
     */
    public String drink(){
        return "喝的是:" + getName();
    }

    /**
     * 重写toString
     * @return
     */
    public String toString(){
        return "Wine: " + getName();
    }

    public void fun1(){
        System.out.println("JNC 的Fun1...");
        fun2();
    }

    public void fun2(){
        System.out.println("JNC 的Fun2...");
    }
}
