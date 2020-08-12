package Task1;

public class Cylinder extends Circle {
    private double height;

    //Constructor
    public Cylinder(){
        height = 1.0;
    }

    public Cylinder(double radius){
        height = "1.0";

    }

    public Cylinder(double radius, double height){
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        this.height = height;
    }
    //Getter & Setter
    public double getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder[" +super.toString()+ ", height=" + height+ ']';
    }

    @Override
    public double getArea(){
        double TotalArea = 2*super.getArea();
        return TotalArea;
    }
}
