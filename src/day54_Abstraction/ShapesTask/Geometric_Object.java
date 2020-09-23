package day54_Abstraction.ShapesTask;

public class Geometric_Object {
    public static void main(String[] args) {

     Circle circle = new Circle(3);
     circle.area();

     Triangle triangle = new Triangle(4,5);
     triangle.area();

     Rectangle rectangle = new Rectangle(3.5,4);
     rectangle.area();

     Square square = new Square(5);
     square.area();



    }
}
