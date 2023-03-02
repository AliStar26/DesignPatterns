package creational.structural.adapter;

import java.awt.*;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        IShape[] shapes = new IShape[]{new RectangleAdapter(new Rectangle()), (IShape) new LineAdapter(new Line())};
        Random random = new Random();
        int x1 = random.nextInt(10);
        int y1 = random.nextInt(10);
        int x2 = random.nextInt(10);
        int y2 = random.nextInt(10);
        IShape[] var7 = shapes;
        int var8 = shapes.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            IShape shape = var7[var9];
            shape.draw(x1, y1, x2, y2);
        }
    }
    }
