import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);

         System.out.println("dlugosc prostokata: " + rectangle.getLength());
        System.out.println("szerokosc prostokata: " + rectangle.getWidth());
        System.out.println("pole prostokata: " + rectangle.calculateArea());
        System.out.println("obwod prostokata: " + rectangle.calculatePerimeter());
    }
}
