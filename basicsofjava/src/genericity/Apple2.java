package genericity;

/**
 * java中使用通配符形参时可以设定上限，同时也可以在定义泛型形参时设定上限，泛型形参的上限设定好之后
 * 表示该泛型形参的实际类型或是该上限类型，或是该上限类型的子类
 * @param <T>
 */
public class Apple2<T extends Number> {
    T col;
    public static void main(String[] args){
        Apple2<Integer> ai = new Apple2<>();
        Apple2<Double> ad = new Apple2<>();
        //下面代码将引发编译异常，下面代码试图把String类型传给T形参
        //但String不是Number的子类型，所以引起编译错误
//        Apple2<String> as = new Apple<>();
    }
}
