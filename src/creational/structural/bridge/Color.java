package creational.structural.bridge;


public class Color extends ShapeBridge {

    public Color(IShape_BP shape_bp) {
        super(shape_bp);
    }

    @Override
    protected void drawShape_ShapeBridge() {

    }

    @Override
    protected void fillColor_ShapeBridge() {
        System.out.println("Inside the class Color extends the ShapeBridge");
        shape_bp.shapeColor_IShape();
    }
}
