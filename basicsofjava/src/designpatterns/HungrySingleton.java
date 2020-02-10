package designpatterns;

public class HungrySingleton {
    private HungrySingleton(){
        if(instance != null)
            try{
                throw new Exception("只能创建一个对象~");
            }catch (Exception e){
                e.printStackTrace();
            }
        System.out.println("loading hungrysingleton Constructor...");
    }
    private static int flag = 1;
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) throws Exception{
//        System.out.println("res:" + HungrySingleton.flag);
        //破解饿汉式单例模式
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println("反射破解单例...");
        HungrySingleton instance1 = HungrySingleton.class.newInstance();
        HungrySingleton instance2 = HungrySingleton.class.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
