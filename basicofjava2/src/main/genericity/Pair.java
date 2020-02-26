package main.genericity;

public class Pair<T> {
    private T firstNumber;
    private T secondNumber;

    public Pair(T firstNumber, T secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Pair(){
        firstNumber = null;
        secondNumber = null;
    }

    public T getFirstNumber(){
        return firstNumber;
    }

    public void setFirstNumber(T firstNumber){
        this.firstNumber = firstNumber;
    }

    public T getSecondNumber(){
        return secondNumber;
    }

    public void setSecondNumber(T secondNumber){
        this.secondNumber = secondNumber;
    }

    /**
     * 交换Pair对象的两个属性的方法
     * @param pair
     */
    public static void swap(Pair<?> pair){
        //很明显这方式不行，因为没有？类型，但可以用以下函数解决
//        ? t = pair.getFirstNumber();
//        pair.setFirstNumber(pair.getSecondNumber());
//        pair.secondNumber(t);
        swapHelper(pair);
    }

    /**
     * 交换Pair对象的两个方法，此方法的参数T捕获通配符；
     * @param pair
     * @param <T>
     */
    public static <T> void swapHelper(Pair<T> pair){
        T t = pair.getFirstNumber();
        pair.setFirstNumber(pair.getSecondNumber());
        pair.setSecondNumber(t);
    }

    //Error:
    //'equals(T)' in 'genericity.Pair' clashes with 'equals(Object)' in 'java.lang.Object';
    // both methods have same erasure, yet neither overrides the other
    //当然，补救方式肯定是重新命名此方法~~~
//    public boolean equals(T value){
//        return firstNumber.equals(value) && secondNumber.equals(value);
//    }

    public static void main(String[] args){
//        Pair<String> pair = new Pair<>("wwf", "fsy");
//        System.out.println("husband:" + pair.getFirstNumber());
//        System.out.println("wife:" + pair.getSecondNumber());

//        Pair pair = new Pair();
////        Pair pair2 = pair.getFirstNumber();
//        Object pair2 = pair.getFirstNumber();
//
//        Object object = new Object();
//        pair.setFirstNumber(object);
//
//        Pair<?> pair3 = new Pair<>();
////        pair3.setFirstNumber(object);
//        Object object2 = pair3.getFirstNumber();

        Manager ceo = new Manager("CEO", 5000, 20000);
        Manager cfo = new Manager("CFO", 5000, 18000);
        Pair<Manager> buddies = new Pair<>(ceo, cfo);
        printBuddies(buddies);

        ceo.setSalaryPlus(50000);
        cfo.setSalaryPlus(52000);
        Manager[] managers = {ceo, cfo};
        Pair<Employee> res = new Pair<>();
        minmaxBonus(managers, res);
        System.out.println("first:" + res.getFirstNumber().getName() + ", second:" + res.getSecondNumber().getName());
        minmaxBonus(managers, res);
        System.out.println("first:" + res.getFirstNumber().getName() + ", second:" + res.getSecondNumber().getName());
    }

    public static void printBuddies(Pair<? extends Employee> pair){
        System.out.println("name:" + pair.getFirstNumber().getName() + ";\n" + "name:" + pair.getSecondNumber().getName() + ";");
    }

    public static void minmaxBonus(Manager[] managers, Pair<? super Manager> res){
        if(managers == null || managers.length == 0)
            return;
        Manager min = managers[0];
        Manager max = managers[0];
        for(int i = 1; i < managers.length; ++i){
            if(min.getSalaryPlus() > managers[i].getSalaryPlus())
                min = managers[i];
            if(max.getSalaryPlus() < managers[i].getSalaryPlus())
                max = managers[i];
        }

        res.setFirstNumber(min);
        res.setSecondNumber(max);
    }
}
//---对应的原始类型为---
//public class Pair{
//    private Object firstNumber;
//    private Object secondNumber;
//
//    public Pair(){}
//
//    public Pair(Object firstNumber, Object secondNumber){
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//    }
//
//    public Object getFirstNumber(){
//        return firstNumber;
//    }
//
//    public void setFirstNumber(Object firstNumber){
//        this.firstNumber = firstNumber;
//    }
//
//    public Object getSecondNumber(){
//        return secondNumber;
//    }
//
//    public void setSecondNumber(){
//        this.secondNumber = secondNumber;
//    }
//}