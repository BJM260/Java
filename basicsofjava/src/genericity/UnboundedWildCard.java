package genericity;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args){
        //动物园列表
        //我的想法
        List<Animal> animalList = new ArrayList<>();
        //老板的想法
        List<? extends Animal> animals = new ArrayList<>();
//        animals.add(new Dog("jiwawa"));
        List<Dog> dogs = new ArrayList<>();
        countLegs(dogs);    //不报错
//        countLegs1(dogs);   //报错
        List<Cat> cats = new ArrayList<>();
        countLegs(cats);
//        countLegs1(cats);

        List<Dog> dogs2 = new ArrayList<>();
        List<Animal> animals2 = new ArrayList<>();
//        new UnboundedWildCard().test(animals, dogs);
    }

    private <T> void test(List<? super T> dst, List<T> src){
        for(T t: src)
            dst.add(t);
    }

    private static int countLegs(List<? extends Animal> animals){
        int retVal = 0;
        for(Animal animal: animals)
            retVal += animal.countLegs();
        return retVal;
    }

    private static int countLegs1(List<Animal> animals){
        int retVal = 0;
        for(Animal animal: animals)
            retVal += animal.countLegs();
        return retVal;
    }
}
