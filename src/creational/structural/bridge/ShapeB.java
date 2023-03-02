package creational.structural.bridge;


public class ShapeB extends ShapeBridge{

    public ShapeB(IShape_BP shape_bp) {
        super(shape_bp);
    }

    @Override
    protected void drawShape_ShapeBridge() {
        System.out.println("Inside the class Shape extends ShapeBridge...");
        shape_bp.shapeType_IShape();
    }

    @Override
    protected void fillColor_ShapeBridge() {

    }
}
