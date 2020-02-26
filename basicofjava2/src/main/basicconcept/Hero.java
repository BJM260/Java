package main.basicconcept;

public class Hero {
    protected final String getName(){
        return "hero~";
    }

    @Override
    public String toString(){
        return getName();
    }

    public static void main(String[] args){
        String name = "Hello~World~";
    }
}
