//package main.unsafe;
//
//import jdk.internal.misc.VM;
//import jdk.internal.reflect.Reflection;
//
//import java.lang.reflect.Field;
//
//public class Unsafe {
//    //单例对象
//    private static final Unsafe theUnsafe = null;
//
//    private Unsafe(){
//
//    }
//
//    public static Unsafe getUnsafe(){
//        Class var = Reflection.getCallerClass();
//        //仅在引导类加载器'BootstrapClassLoader'加载时才合法
//        if(!VM.isSystemDomainLoader(var.getClassLoader())){
//            throw new SecurityException("Unsafe");
//        }else {
//            return theUnsafe;
//        }
//    }
//
////    private static Unsafe reflectGetUnsafe(){
////        try{
////            Field field = Unsafe.class.getDeclaredField("theUnsafe");
////            field.setAccessible(true);
////            return (Unsafe)field.get(null);
////        }catch (Exception e){
////            log.error(e.getMessage(), e);
////            return null;
////        }
////    }
//}
