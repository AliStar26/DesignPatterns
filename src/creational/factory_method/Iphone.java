package creational.factory_method;

public class Iphone extends SmartPhone {
    private String modelName;
    public Iphone(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
