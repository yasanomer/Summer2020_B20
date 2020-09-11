package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Rectangle rectangle1= new Rectangle(3,4);

        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println("=========================");
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());



    }
}
