package main.genericity;

import java.util.logging.Logger;

public class Problem<T>/* extends Exception*/ { //Error---can't extend Throwable
    public static <T extends Throwable> void doWork(Class<T> tClass){
//        try{
//            //do work
//        }catch (T e){   //Error--can't catch type variable
//            Logger.global.info("...");
//        }
    }

    public static <T extends Throwable> void doWorkTwo(T t) throws T{   //OK
        try{
            //do work
        }catch (Throwable realCause){
            t.initCause(realCause);
            throw t;
        }
    }
}
