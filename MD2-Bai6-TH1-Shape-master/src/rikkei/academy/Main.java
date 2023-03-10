package rikkei.academy;

public class Main {

    public static void main(String[] args) {
        // Kiểm thử
        Shape array[] = new Shape[3];
        array[0] = new Circle(10);
        array[1] = new Rectangle(5, 7);
        array[2] = new Square(4);

        for (Shape shape : array) {
            System.out.println(shape);
            double random = (int) (Math.random() * 100);
//            System.out.println(random);

            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(random);

            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(random);

            } else {
                Square square = (Square) shape;
                shape.resize(random);
            }
            System.out.println(shape);
        }
    }}
