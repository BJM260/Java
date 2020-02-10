package designpatterns;

public enum EnumSingletonInstance {
    INSTANCE;
    public static EnumSingletonInstance getInstance(){
        return INSTANCE;
    }
}
