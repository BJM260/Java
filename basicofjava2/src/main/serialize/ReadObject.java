package main.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化步骤：
 * ①创建一个ObjectInputStream输入流
 * ②调用ObjectInputStream对象的readObject()得到序列化的对象
 */
public class ReadObject {
    public static void main(String[] args){
        try{
            //创建一个ObjectInputStream输入流
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"));
            Person person = (Person)objectInputStream.readObject();
            System.out.println(person);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
