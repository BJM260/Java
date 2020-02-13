package genericity;

public class ArrayAlg {
//    public static Pair<String> minmax(String[] a){
//        if(a == null || a.length == 0)
//            return null;
//        String min = a[0];
//        String max = a[0];
//        for(int i = 1; i < a.length; ++i){
//            if(min.compareTo(a[i]) > 0)
//                min = a[i];
//            if(max.compareTo(a[i]) < 0)
//                max = a[i];
//        }
//        return new Pair<>(min, max);
//    }

    public static <T extends Comparable> Pair<T> minMax(T[] a){
        if(a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for(int i = 1; i < a.length; ++i){
            if(min.compareTo(a[i]) > 0)
                min = a[i];
            if(max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<T>(min, max);
    }

    /**
     * 此方法中使用<T extends Comparable>限制了类型变量T只能被实现了Comparable接口的类（String、LocalDate等）；
     * 当然一个类型变量或通配符可以有多个限定：<T extends Comparable & Serializable>，其中限定类型用"&"分隔；而逗号用来分隔类型变量；
     * @param a
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T min(T[] a){
        if(a == null || a.length == 0)
            return null;
        T smallest = a[0];
        for(int i = 1; i < a.length; ++i)
            if(smallest.compareTo(a[i]) > 0)
                smallest = a[i];
        return smallest;
    }

    /**
     * 泛型方法，可在普通类中，也可在泛型类中；
     * 其中类型变量放在修饰符后，返回类型前；
     * @param a
     * @param <T>
     * @return
     */
    public static <T> T getMiddle(T[] a){
        return a[a.length / 2];
    }

    public static void main(String[] args){
        //当调用一个泛型方法时，在方法名前的尖括号中放入具体的类型；在当前情况下，可省略<String>类型参数；
        //因为编译器可以自行判断出调用的方法；
//        String middle = ArrayAlg.<String>getMiddle(new String[]{"a", "b", "c", "d", "e", "f"});
//        String middle2 = ArrayAlg.getMiddle(new String[]{"a", "b", "c", "d", "e", "f"});
//        System.out.println("middle:" + middle);
//        Double middle3 = ArrayAlg.<Double> getMiddle(new Double[]{3.14, 1729.0, 1.0});
//        System.out.println("middle3:" + middle3);

        String[] temp = new String[]{"a", "b", "d", "o", "p", "q"};
        String min = ArrayAlg.<String>minMax(temp).getFirstNumber();
        String max = ArrayAlg.<String>minMax(temp).getSecondNumber();
        System.out.println("min:" + min);
        System.out.println("max:" + max);
    }
}
