package genericity;

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

    //Error:
    //'equals(T)' in 'genericity.Pair' clashes with 'equals(Object)' in 'java.lang.Object';
    // both methods have same erasure, yet neither overrides the other
    //当然，补救方式肯定是重新命名此方法~~~
//    public boolean equals(T value){
//        return firstNumber.equals(value) && secondNumber.equals(value);
//    }

    public static void main(String[] args){
        Pair<String> pair = new Pair<>("wwf", "fsy");
        System.out.println("husband:" + pair.getFirstNumber());
        System.out.println("wife:" + pair.getSecondNumber());
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