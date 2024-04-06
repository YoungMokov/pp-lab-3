
import java.math.*;
public class geometry {

    private double  center;

    private double  radius;
    
    public double  getCenter() {
        return center;
    }

    public double  getRadius() {
        return radius;
    }
    public geometry(double  radius, double  center) {
        this.radius = radius;
        this.center = center;
    }
    public  double  calculatePerimeter(double  radius, double  center) {
    return (double ) (2 * 3.14 * radius) ;
    }
    
}
