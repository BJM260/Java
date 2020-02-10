package createobject;

public class Animal implements Cloneable{
    private String name = null;
    private int age = 0;

    public Animal(){ }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Animal animal = (Animal) super.clone();
        animal.name = new String(name);
        return animal;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal dog = new Animal("Dog", 1);
        Animal smallDog = (Animal)dog.clone();
        System.out.println("dog:" + dog.getName() + ", " + dog.getAge());
        System.out.println("smallDog:" + smallDog.getName() + ", " + smallDog.getAge());
        System.out.println(dog);
        System.out.println(smallDog);
    }
}
