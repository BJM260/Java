package exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

/**
 * 递归阶乘函数的堆栈情况
 */
public class StackTraceTest {
    public static int factorial(int n){
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f: frames)
            System.out.println(f);
        int r;
        if(n <= 1)
            r = 1;
        else
            r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args){
        Throwable t = new Throwable();
        StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        String description = out.toString();
        System.out.println("description:" + description);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n = in.nextInt();
//        factorial(n);
    }
}
