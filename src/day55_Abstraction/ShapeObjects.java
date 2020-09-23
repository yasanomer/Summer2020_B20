package day55_Abstraction;

public class ShapeObjects {
    public static void main(String[] args) {
        //Shape shape1 = new Shape() ;
        Circle circle = new Circle(2.5);

        System.out.println(circle);
        System.out.println("Circle Has Volume : "+Circle.hasVolume);

        Circle circle1 = new Circle(5.5);
        System.out.println(circle1);

        System.out.println("========================");

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        System.out.println(new Rectangle(20,30));
        System.out.println("========================");

        Cylinder cylinder = new Cylinder(4,8);
        System.out.println(cylinder);



    }




}
