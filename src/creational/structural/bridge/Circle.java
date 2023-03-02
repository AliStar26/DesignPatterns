package creational.structural.bridge;


public class Circle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the class Circle...");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the class Circle, inside the color method...");
    }
}
