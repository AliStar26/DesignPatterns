package creational.factory_method;

public class Main {
    public static void main(String[] args){
        SmartPhone iPhone = SmartPhoneFactory.getInstance(
                "Iphone",
                "Iphone 14 Pro");
        SmartPhone samsung = SmartPhoneFactory.getInstance(
                "Samsung",
                "Galaxy S9");
        SmartPhone huawei = SmartPhoneFactory.getInstance(
                "Huawei",
                "P90");
        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(huawei);

        System.out.println(iPhone.getClass());
        System.out.println(samsung.getClass());
        System.out.println(huawei.getClass());
    }
}
