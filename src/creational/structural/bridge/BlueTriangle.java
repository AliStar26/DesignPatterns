package creational.structural.bridge;


public class BlueTriangle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the class BlueTriangle,  which implements shapeType_IShape()");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the class BlueTriangle, which implements shapeColor_IShape()");
    }
}
