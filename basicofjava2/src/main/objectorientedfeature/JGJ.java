package main.objectorientedfeature;

public class JGJ extends Wine {
    public JGJ(){
        setName("JGJ");
    }

    /**
     * 重写父类方法，实现多态
     * @return
     */
    public String drink(){
        return "喝的是:" + getName();
    }

    /**
     * 重写toString()
     * @return
     */
    public String toString(){
        return "Wine: " + getName();
    }
}
