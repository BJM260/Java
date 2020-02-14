package genericity;

public class GenericityFunction {
    public static void main(String[] args){
        //未指定泛型
        int number1 = GenericityFunction.add(1, 2);
        Number number2 = GenericityFunction.add(1, 1.2);
        Object number3 = GenericityFunction.add(1, "add");

        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("number3:" + number3);

        //指定泛型
        int a = GenericityFunction.<Integer>add(1, 2);
//        int b = GenericityFunction.<Integer>add(1, 2.2);  //编译错误，制定了Integer，不能为Float
        Number c = GenericityFunction.<Number>add(1, 2.2);
    }

    private static <T> T add(T x, T y){
        return y;
    }
}
