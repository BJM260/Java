package main.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AllDemo {
    public static void main(String[] args){
        System.out.println("---calculator---");
        CMDCalculator();
    }

    public static void CMDCalculator(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int res = devide(num1, num2);
        System.out.println("res:" + res);
        scan.close();
    }

    public static int devide(int num1, int num2){
        return num1 / num2;
    }

    public void testException() throws IOException {
        //FileInputStream的构造函数会抛出FileNotFoundException
        FileInputStream fileInputStream = new FileInputStream("F:\\CodeMan\\Temp\\a.txt");

        int word;
        //read方法会抛出IOException
        while((word = fileInputStream.read()) != -1){
            System.out.println((char)word);
        }
        //close方法会抛出IOException
        fileInputStream.close();
    }
}
