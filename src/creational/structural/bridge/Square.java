package creational.structural.bridge;



public class Square implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the class Square...");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the class Square, inside the color method...");
    }

}
