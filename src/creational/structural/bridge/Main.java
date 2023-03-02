package creational.structural.bridge;


public class Main {
    public static void main(String[] args) {
        ShapeBridge square = new ShapeB(new Circle());
        ShapeBridge triangle = new ShapeB(new Triangle());
        square.drawShape_ShapeBridge();
        System.out.println("test....");
        triangle.drawShape_ShapeBridge();

        ShapeBridge blueTriangle = new Color(new RedTriangle());
        blueTriangle.shape_bp.shapeType_IShape();
        blueTriangle.shape_bp.shapeColor_IShape();

        ShapeBridge redTriangle = new Color(new RedTriangle());
        redTriangle.shape_bp.shapeType_IShape();
        redTriangle.shape_bp.shapeColor_IShape();

    }
}
