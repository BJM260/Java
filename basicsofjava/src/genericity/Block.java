package genericity;

/**
 * 此类的设计目的是：
 * 用户可覆盖body方法提供一个具体的动作；调用toThread时，会得到Thread类的一个对象，而它的run方法不会介意受查异常；
 */
public abstract class Block {
    public abstract void body() throws Exception;

    public Thread toThread(){
        return new Thread(){
            public void run(){
                try{
                    body();
                }catch (Throwable t){
                    Block.<RuntimeException>throwAs(t);
                }
            }
        };
    }
    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void throwAs(Throwable e)throws T{
        throw (T) e;
    }
}
