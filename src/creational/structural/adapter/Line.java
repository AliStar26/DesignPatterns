package creational.structural.adapter;

public class Line {
    public Line() {
    }

    public void draw(int x, int y, int k, int z) {
        System.out.println("Line from point A(" + x + "," + y + "),  to point B(" + k + "," + z + ")");
    }

}
