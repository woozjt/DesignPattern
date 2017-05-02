package Creational.FactoryPattern.Yanmo.第2版简单工厂的示例代码;

public class Factory{
    public static Api createApi(int condition){
        Api api=null;
        if(condition==1){
            api=new ImplA();
        } else if(condition==2){
            api=new ImplB();
        }
        return api;
    }
}
