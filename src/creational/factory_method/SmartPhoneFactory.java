package creational.factory_method;

public class SmartPhoneFactory{
    public static SmartPhone getInstance(String name, String modelName){
        if(name == "Iphone"){
            return new Iphone(modelName);
        }else if(name == "Samsung"){
            return new Samsung(modelName);
        }else if(name == "Huawei"){
            return new Huawei(modelName);
        }
        return null;
    }
}
