package test;

import java.io.Serializable;

public class Girl implements Serializable {
    private int age;
    private int height;
    private String name;

    public Girl(){

    }

    public Girl(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Girl{" + "name:" + name + ", " + "age:" + age + ", " + "height:" + height + ";}";
    }
}
