package main.designpatterns;

public class StaticInnerSingleton {
    private StaticInnerSingleton(){

    }

    private static class StaticInnerSingletonInstance{
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return StaticInnerSingletonInstance.instance;
    }
}
