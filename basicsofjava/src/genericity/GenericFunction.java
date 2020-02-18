package genericity;

//泛型类
public class GenericFunction<K, V> {
    private K key;
    private V value;

    public GenericFunction(){}

    public GenericFunction(K key, V value){
        this.key = key;
        this.value = value;
    }

    /**
     * 此方法不是泛型方法，它只是类的普通成员方法；
     * 只不过它的返回值是声明泛型类时声明过的泛型；
     * @return
     */
    public V getValue(){
        return value;
    }

    /**
     * 此方法有问题，编译器会报"cannot reslove symbol E"；
     * 此类中未声明泛型E，所以让E作为返回值和形参时，编译器无法识别；
     */
//    public E setKey(E key){
//        this.key = key;
//    }

    /**
     * 此方法有问题，因为之声明了<T>，未声明E
     * @param e
     * @param <T>
     * @return
     */
//    public <T> T getKey(E e){
//        //...
//    }

    /**
     * 这是一个泛型方法；public（若有static关键字则直接写在public后）
     * 和返回值（此处的返回值是K）之间要写<E>（必不可少），表明这是一个泛型方法；
     * 且声明了个泛型E；E可以出现在此泛型方法的任意位置；
     * @param e
     * @param <E>
     */
    public <E> K getNewKey(E e){
        //此例子不大恰当/(ㄒoㄒ)/~~
        this.key = (K) e;
        return this.key;
    }

    //普通方法，只是形参是GenericFunction<Number, Number> genericFunction
    public void printKeyValue(GenericFunction<Number, Number> genericFunction){
        System.out.println("测试:" + genericFunction.getValue());
    }
    //普通方法，只是形参中有通配符?
    public void printKeyValue(GenericFunction<?, ?> genericFunction, GenericFunction<Number, Number> genericFunction2){
        System.out.println("测试:" + genericFunction + ", " + genericFunction2);
    }

    public static void main(String[] args) throws ClassNotFoundException {

    }
}
