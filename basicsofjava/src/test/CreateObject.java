package test;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * java创建对象的方式
 */
public class CreateObject implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        //①使用new
//        CreateObject createObject = new CreateObject();
//        //②clone
//        CreateObject createObject2 = (CreateObject) createObject.clone();

//        Girl mike = new Girl("Mike", 30, 170);
//        Girl tina = new Girl("Tina", 35, 176);
//        Girl rona = new Girl("Rona", 22, 168);

        //需要一个文件输出流和对象输出流；文件输出流用于将字节输出到文件，对象输出流用于将对象输出为字节
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
//        outputStream.writeObject(mike);
//        outputStream.writeObject(tina);
//        outputStream.writeObject(rona);
//
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"));
//        Girl one = (Girl)inputStream.readObject();
//        Girl two = (Girl)inputStream.readObject();
//        Girl three = (Girl)inputStream.readObject();
//
//        System.out.println("name:" + one.getName() + ", age:" + one.getAge() + ", height:" + one.getHeight());
//        System.out.println("name:" + two.getName() + ", age:" + two.getAge() + ", height:" + two.getHeight());
//        System.out.println("name:" + three.getName() + ", age:" + three.getAge() + ", height:" + three.getHeight());

//        Girl girl = Girl.class.newInstance();
//        girl.setAge(18);
//        girl.setName("彭怀瑾");
//        System.out.println(girl);

        String string = new String("hello");
        System.out.println(string);

//        Class p = Girl.class;
//
//        for(Constructor constructor: p.getConstructor())
//            System.out.println(constructor);
//
//        System.out.println("end~");
    }
}
