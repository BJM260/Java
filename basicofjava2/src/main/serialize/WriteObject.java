package main.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化步骤：
 * ①创建一个ObjectOutputStream输出流
 * ②调用ObjectOutputStream对象的writeObject输出可序列化对象
 */
public class WriteObject {
    public static void main(String[] args){
        try{
            //创建ObjectOutputStream输出流
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
            //将对象序列化到文件s
            Person person = new Person("冯澍滢", 25);
            objectOutputStream.writeObject(person);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("success~");
    }
}
