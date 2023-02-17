package figure;

public class figure {

    private String name;
    private double perimeter;
    private double square;

    figure(String name, double perimeter, double square){
        this.name=name;
        this.perimeter=perimeter;
        this.square=square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
