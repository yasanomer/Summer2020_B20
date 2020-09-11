package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public double area;
    public double perimeter;

    static {// only runs one time,first to run
        PI=3.14;
    }

    public Circle (double radius){
        this.radius = radius;
        diameter = radius*2;
        PI = 3.14;
        area = calculateArea();
        perimeter=calculatePerimeter();

    }
    public double calculateArea (){
        return radius*radius*PI;
    }

    public double calculatePerimeter (){
        return diameter*PI;
    }

    public String toString (){
        return "Radius: "+radius+", Diameter: "+diameter+"Area: "+area+"Perimeter: "+perimeter;
    }
}
