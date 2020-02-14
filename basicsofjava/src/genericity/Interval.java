package genericity;

import java.io.Serializable;

//public class Interval <T extends Comparable & Serializable> implements Serializable{
//    private T lower;
//    private T upper;
//
//    public Interval(){}
//    public Interval(T lower, T upper){
//        if(lower.compareTo(upper) <= 0){
//            this.lower = lower;
//            this.upper = upper;
//        }else {
//            this.lower = upper;
//            this.upper =  lower;
//        }
//    }
//}
//对应的原始类型
public class Interval implements Serializable{
    private Comparable lower;
    private Comparable upper;

    public Interval(){}
    //...
    //Pair<Employee> buddies = ...;
    //Employee buddy = buddies.getFirst();
}
