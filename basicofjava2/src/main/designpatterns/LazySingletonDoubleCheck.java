package main.designpatterns;

public class LazySingletonDoubleCheck {
    private LazySingletonDoubleCheck(){

    }

    private static volatile LazySingletonDoubleCheck instance = null;

    public static LazySingletonDoubleCheck getInstance(){
        if(instance == null)
            synchronized (LazySingletonDoubleCheck.class){
                if(instance == null)
                    instance = new LazySingletonDoubleCheck();
            }

        return instance;
    }
}
