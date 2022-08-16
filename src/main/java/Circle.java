public class Circle {

    static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}

