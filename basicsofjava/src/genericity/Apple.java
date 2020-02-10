package genericity;

/**
 * 可为任何类、接口增加泛型声明；
 * 定义Apple类时使用了泛型声明
 * @param <T>
 */
public class Apple<T> {
    //使用T类型定义实例变量
    private T info;
    public Apple(){}

    /**
     * 创建带泛型的自定义类时，写构造方法时方法名只写类名，不写类名后边的<>和其他的，而调用该构造方法时可以使用类名<>
     * @param info
     */
    //下面方法中使用T类型来定义构造器
    public Apple(T info){
        this.info = info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo(){
        return this.info;
    }

    public static void main(String[] args){
        /**
         * 使用Apple<T>类时可为T形参传入实际类型，从而可以生成多个逻辑子类；如：Apple<String>，Apple<Double>……
         */
        //由于传给T形参的是String，因此构造器参数只能是String
        Apple<String> a1 = new Apple<>("Apple");
        System.out.println(a1.getInfo());
        //由于传给T形参的是Double，因此构造器参数只能是Double或double
        Apple<Double> a2 = new Apple<>(5.67);
        a2.setInfo(1.112);
        System.out.println(a2.getInfo());
        //其实好像不传类型参数也行，其中的泛型类型都按照Object算
        Apple a3 = new Apple("1");
        a3.setInfo(1.0);
        System.out.println(a3.getInfo());
        Apple a4 = new Apple();

    }
}
