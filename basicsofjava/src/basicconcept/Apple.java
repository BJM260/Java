package basicconcept;

public class Apple extends Fruit {
    public String getName(){
        return "Apple";
    }

    public float getPrice(){
        return 5.0f;
    }

    public static void main(String[] args){
        Fruit f = new Apple();
        System.out.println(f.getPrice());
        System.out.println(f.getName());
    }
}
