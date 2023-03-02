package creational.structural.bridge;

public class Triangle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the class Triangle...");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the class Triangle, inside the color method...");
    }
}
