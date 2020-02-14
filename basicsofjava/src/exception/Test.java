package exception;

import java.io.*;
import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Throwable {
//        System.out.println(f(2));

//        try(Resource res = ...){
//            //work with res
//        }

//        try(Scanner in = new Scanner(new FileInputStream("/usr/share/dict/words"), "UTF-8")){
//            while(in.hasNext()){
//                System.out.println(in.next());
//            }
//        }

//        try(Scanner in = new Scanner(new FileInputStream("/usr/share/dict/words"), "UTF-8");
//            PrintWriter out = new PrintWriter("out.txt")){
//            while(in.hasNext()){
//                out.println(in.next().toUpperCase());
//            }
//        }

//        System.out.println(printException());
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int res = 0;
//        assert x >= 0;
//        System.out.println("res:" + res);
//        Logger.getGlobal().setLevel(Level.OFF);
//        System.out.println("Hello~SunWuKong~");
//        Logger.getGlobal().info("File->Open menu item selected");

//        Logger myLogger = Logger.getLogger("com.basicofjava");
//        myLogger.setLevel(Level.FINE);
//        myLogger.info("Hello~KeLin~");
//        myLogger.setLevel(Level.OFF);
//        myLogger.info("Hello~YaMuCha");
//        Logger.getGlobal().info("Hello~TianJinFan~");

//        int x = 1;
//        Logger.getGlobal().info("x" + x);

//        int x = 1;
//        System.out.println("x=" + x);
//        Logger.getGlobal().info("x=" + x);

//        Thread.dumpStack();

//        StringWriter out = new StringWriter();
//        new Throwable().printStackTrace(new PrintWriter(out));
//        String description = out.toString();
//        System.out.println("description:" + description);

//        try(1/0){
//
//        }

//        System.out.println("Hello~sunwukong");

        Stack<Integer> stack = new Stack<>();
        printStack(stack);
    }

    private static void printStack(Stack<Integer> stack) throws Throwable {
        for(int i = 0; i < 100; ++i){
            try{
                System.out.println("i:" + i + stack.pop());
            }catch (EmptyStackException e){
                Throwable throwable = new EmptyStackException();
                throwable.initCause(e);
//                throw throwable;
                System.out.println("exception:" + throwable);
            }
        }
    }

    private static int printException(){
        int res = 0;
        try{
            res = 5 / 0;
        }catch (Exception e){
            throw e;
        }finally {
//            return -1;
        }
        return res;
//        return res;
    }

    /**
     * n=2时，return 0;
     * 如果调用f(2)，那么try语句块的计算结果为r = 4，并执行return语句然而，
     * 在方法真正返回前，还要执行finally子句；finally子句将使得方法返回0，
     * 这个返回值覆盖了原始的返回值4；
     * @param n
     * @return
     */
    public static int f(int n){
        try{
            int r = n * n;
            return n;
        }finally {
            if(n == 2)
                return 0;
        }
    }

//        try{
//            code
//            more code
//            more code
//        }catch (ExceptionType e){
//            handler for this type
//        }
        //其中若try语句块中的任何代码抛出了一个在catch子句中说明的异常类，那程序直接跳过try语句块的其余代码，直接执行catch子句中处理的代码；若方法中抛出的异常在catch语句中没有其对应的异常类型，方法会立刻退出（设计者要充分考虑异常）；

//        try{
//            //code that might throw exception
//        }catch (FileNotFoundException e) {
//            //获得对象更多信息
//            e.getMessage();
//            //emergency action for missing files
//
////        }catch (UnknownHostException e){
////            //得到详细的错误信息
////            e.getClass().getName();
////            //emergency action for unknown hosts
//        }catch (IOException e){
//            //emergency action for all other I/O problems
//        }

        //捕获异常并再次抛出的基本方法
//        try{
//            //access the database
//        }catch(SQLException e){
//            throw new ServletException("database error:" + e.getMessage());
//        }

        //更好的方式：原始异常设置为新异常
        //建议使用此技术，此方式会抛出子系统的高级异常，不会丢失原始异常的细节
//        try{
//            //access the database
//        }catch (SQLException e){
//            Throwable se = new ServletException("database error");
//            se.initCause(e);
//            throw se;
//        }
//        //调用此方法者捕获到此异常后，可用下面语句重新获得原始异常：
//        Throwable e = se.getCause();

        //只想记录一个异常，再将它重新抛出，而不做任何改变：
//        try{
//            //access the database
//        }catch (Exception e){
//            logger.log(level, message, e);
//            throw e;
//        }
//        //此程序将在所有情况下关闭文件
//        InputStream in = new FileInputStream(...);
//        try{
//            //code that might throw exception
//        }catch(IOException e){
//            show error message
//        }finally{
//            in.close();
//        }

//        InputStream in = ...;
//        try{
//            //code might throw exception
//        }finally {
//            in.close();
//        }

//        /**
//         * 解耦try/catch和try/finally语句块：
//         * 此种设计不仅清楚，且还有一个功能，将会报告finally子句中出现的错误
//         */
//        InputStream in = ...;
//        //外层try语句块只有一个职责，确保报告出现的错误
//        try{
//            //内层try语句块只有一个职责，确保关闭输入流
//            try{
//                //code that might throw exceptions
//            }finally{
//                in.close();
//            }
//        }catch(IOException e){
//            //show error message
//        }

//    //第一种形式
//    throw new EOFException;
//
//    //第二种形式
//    EOFException e = new EOFException();
//    throw e;
//
//    //完整形式
//    String readData(Scanner in) throws EOFException{
//        //...
//        while(//...){
//            if(!in.hasNext()) {
//                if(n < len) {
//                    String gripe = "Content-length:" + len + ", Received:" + n;
//                    throw new EOFException(gripe);
//                }
//            }
//        }
//
//        return s;
//    }

    //使用异常捕获的方式处理异常
//    public void read(String filename){
//        try{
//            InputStream in = new FileInputStream(filename);
//            int b;
//            while((b = in.read()) != -1){
//                //process input
//            }
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }
//    }

    //使用抛出的方式处理异常
//    public void read(String filename) throws IOException{
//        InputStream in = new FileInputStream(filename);
//        int b;
//        while((b = in.read()) != -1){
//            //process input
//        }
//    }
}
