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

    public static void main(String[] args){
        Pair<String> pair = new Pair<>("wwf", "fsy");
        System.out.println("husband:" + pair.getFirstNumber());
        System.out.println("wife:" + pair.getSecondNumber());
    }
}
