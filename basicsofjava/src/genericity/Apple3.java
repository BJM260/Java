package genericity;

//泛型形参指定多个上限时，所有的接口上限必须位于类上限之后
//表明T类型必须是Number类或其子类，并必须实现java.io.Serializable接口
public class Apple3<T extends Number & java.io.Serializable> {

}
