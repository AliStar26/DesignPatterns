package creational.structural.adapter;

import creational.abstract_factory.IShape;
import creational.abstract_factory.Rectangle;

public class LineAdapter implements IShape {
    private Line adaptee;

    public LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }

    public void draw(int x1, int y1, int x2, int y2) {
        this.adaptee.draw(x1, y1, x2, y2);
    }

    @Override
    public void drawShape() {

    }
}

