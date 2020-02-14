package genericity;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        //创建List<String>对象和List<Integer>对象
//        List<String> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        //比较list1对象和list2对象
//        System.out.println(list1.getClass() == list2.getClass());
//        String number = "123456789";
//        char[] numberArray = number.toCharArray();
//
//        for(int i = 0; i < numberArray.length; ++i)
//            System.out.println(numberArray[i]);

//        Pair<String> pair = new Pair<>("wwf", "fsy");
//        Pair<Integer> pair2 = new Pair<>(1, 2);
//
//        System.out.println("husband:" + pair.getHusband());
//        System.out.println("wife:" + pair.getWife());

//        System.out.println("b".compareTo("a"));

//        ArrayList<String> list = new ArrayList<>();
//        list.add("abc");
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(123);
//
//        System.out.println(list.getClass() == list2.getClass());

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list.get(1));
//
//        list.getClass().getMethod("add", Object.class).invoke(list, "asd");
//
//        for(int i = 0; i < list.size(); ++i)
//            System.out.println(list.get(i));

//        List<Double> list = new ArrayList<>();
//        //编译不通过
//        List<double> list2 = new ArrayList<>();
        //主要原因是类型擦除之后List类有Object类型的域，Object可以存储Double引用，而不能存储double的值；

        //检查a是否是任意类型的一个Pair
//        if(a instanceof Pair<String>)   //Error
//        if(a instanceof Pair<T>)
        //同样也可用强制类型转换检查
//        Pair<String> p = (Pair<String>)a;

//        Pair<String> stringPair = new Pair<>();
//        Pair<Integer> integerPair = new Pair<>();
//        //getClass方法返回原始类型
//        if(stringPair.getClass() == integerPair.getClass())
//            System.out.println("res: true");

//        Pair<String>[] nums = new Pair<String>[10];   //Error
//        Pair<String>[] table =(Pair<String>[]) new Pair<?>[10]; //可以创建但是不安全

//        Pair<Manager> managerPair = new Pair<>(ceo, cfo);
//        Pair<Employee> employeePair = managerPair;  //illegal, but suppose it wasn't
//        employeePair.setFirstNumber(lowlyEmployee);

//        Pair<Integer> pair = new Pair<>();
//        Pair rawPair = pair;
//        rawPair.setFirstNumber(1);
//        System.out.println(rawPair.getFirstNumber());

        List<?> list = new ArrayList<>();
        List list1 = new ArrayList();
        list.add(null);
        list1.add(1);
    }

//    public static <T extends Comparable> T min(T[] a){
//        //...
//    }
    //擦除类型之后
//    public static Comparable min(Comparable[] a){
//        //...
//    }

//    public static <T> void addAll(Collection<T> coll, T ... ts){
//        for(t: ts) coll.add(t);
//    }
}
