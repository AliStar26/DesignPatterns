package creational.structural.decorator;


public class Main {
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rectangle = new Rectangle();

        IShape redCircle = new RedShapeDecorator(new Circle());
        IShape blueCircle = new BlueShapeDecorator(new Circle());

        IShape redRectangle = new RedShapeDecorator(new Rectangle());
        IShape blueRectangle = new BlueShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.drawShape();

        System.out.println("Circle with red border");
        redCircle.drawShape();

        System.out.println("Circle with blue border");
        blueCircle.drawShape();

        System.out.println("Rectangle with normal border");
        rectangle.drawShape();

        System.out.println("Rectangle with red border");
        redRectangle.drawShape();

        System.out.println("Rectangle with blue border");
        blueRectangle.drawShape();


    }
}
