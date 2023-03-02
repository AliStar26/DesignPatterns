package creational.structural.bridge;


public abstract class ShapeBridge {
    protected IShape_BP shape_bp;

    public ShapeBridge(IShape_BP shape_bp) {
        this.shape_bp = shape_bp;
    }

    protected abstract void drawShape_ShapeBridge();
    protected abstract void fillColor_ShapeBridge();
}
