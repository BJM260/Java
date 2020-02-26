package main.genericity;

public class PairAlg {
    public static boolean hasNulls(Pair<?> pair){
        return pair.getFirstNumber() == null || pair.getSecondNumber() == null;
    }

    public static void swap(Pair<?> pair){
        swapHelper(pair);
    }

    public static <T> void swapHelper(Pair<T> pair){
        T temp = pair.getFirstNumber();
        pair.setFirstNumber(pair.getSecondNumber());
        pair.setSecondNumber(temp);
    }
}
