import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new Circle(new Point(2, 2), 3.0);
        circles[2] = new Circle(new Point(-3, 1), 4.0);

        ColoredCircle[] coloredCircles = new ColoredCircle[2];
        coloredCircles[0] = new ColoredCircle(new Point(1, -1), 6.0, "red");
        coloredCircles[1] = new ColoredCircle(new Point(-2, -2), 2.5, "green");

        System.out.println("Obwody kół:");
        for (Circle circle : circles) {
            System.out.println("Obwód: " + circle.calculatePerimeter());
        }
        
        System.out.println("\nObwody kolorowych kół:");
        for (ColoredCircle coloredCircle : coloredCircles) {
            System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
            System.out.println("Kolor: " + coloredCircle.getColor());
        }
    }
}