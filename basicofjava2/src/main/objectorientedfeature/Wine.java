package main.objectorientedfeature;

public class Wine {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Wine(){}

    public String drink(){
        return "喝的是：" + getName();
    }

    /**
     * 重写toString
     * @return
     */
    public String toString(){
        return null;
    }

    public void fun1(){
        System.out.println("Wine 的Fun1...");
        fun2();
    }

    public void fun2(){
        System.out.println("Wine 的Fun2...");
    }
}
