package serialize;

import java.io.Serializable;

/**
 * 需序列化的对象对应的类
 */
public class Person implements Serializable {
    private String name;
    private int age;
    //没有无参构造方法
    public Person(String name, int age){
        System.out.println("反序列化，你调用我了么?");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{ " + "name = '" + name + '\'' + ", age = " + age + '}';
    }
}
