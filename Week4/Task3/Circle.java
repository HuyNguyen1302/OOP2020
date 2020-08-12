package Task3;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius =  radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea () {
        double radius = this.radius;
        return  3.14*radius*radius;
    }

    @Override
    public double getParameter() {
        return 0;
    }
}
