package createobject;

public class TestCreateObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("Dog", 2);
        System.out.println(animal);
//        System.out.println("animal:" + animal.getName() + ", animal age:" + animal.getAge());
        Animal animal2 = (Animal)animal.clone();
        System.out.println(animal2);
        System.out.println(animal == animal2);
        System.out.println(animal.getName() == animal2.getName());
    }
}
