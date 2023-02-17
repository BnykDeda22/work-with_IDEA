package figure;

public class circle extends figure{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    circle(String name, double perimeter, double square, double radius) {
        super(name, perimeter, square);
        this.radius=radius;
    }

}
