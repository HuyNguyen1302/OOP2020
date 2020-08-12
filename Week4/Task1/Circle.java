package Task1;

public class Circle {
    private double radius;
    private String color;
    protected final double PI = 3.14;
    //Constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    //Setter & Getter
    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public double getArea(){
        return PI*radius*radius;
    };

    public String toString(){
        System.out.println("Circle[radius=" + radius +", color =" + color]");
    };

}
