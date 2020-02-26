package main.genericity;

public class Dog extends Animal {
    private String name;

    public Dog(String name){
        super(name);
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int countLegs(){
        return 4;
    }
}
