package creational.structural.decorator;


public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void drawShape(){
        decoratedShape.drawShape();
        setRedBorder(decoratedShape);
    }

    protected void setRedBorder(IShape decoratedShape){
        System.out.println("Border color: Red");
    }
}
