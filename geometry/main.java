
import java.math.*;
public class main {

    public static void main(String[] args) {
        Point punkt = new Point(2, 3);

        System.out.println("Wartosci punktu:");
        System.out.println("x: " + punkt.getX());
        System.out.println("y: " + punkt.getY());
        geometry Circle = new geometry(2,3);
        System.out.println("wartośći koła:");
        System.out.println("radius: " + Circle.getRadius());
        System.out.println("center: " + Circle.getCenter());
        System.out.println("Perimeter: " + Circle.calculatePerimeter(2, 3));
        
    }
}