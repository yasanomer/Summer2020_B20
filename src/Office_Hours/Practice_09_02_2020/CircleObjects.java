package Office_Hours.Practice_09_02_2020;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);

        System.out.println("Circle1' radius: "+circle1.radius); // 3.0
        System.out.println("Circle1' diameter: "+circle1.diameter); // 6.0

       // System.out.println("Circle1' area: "+circle1.calculateArea());
        System.out.println("Circle1' area: "+circle1.area);

      //  System.out.println("Circle1' perimeter: "+circle1.calculatePerimeter());
        System.out.println("Circle1' perimeter: "+circle1.perimeter);

        System.out.println("==========================================");

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle1' radius: "+circle2.radius);
        System.out.println("Circle1' diameter: "+circle2.diameter);
        System.out.println("Circle1' area: "+circle2.area);
        System.out.println("Circle1' perimeter: "+circle2.perimeter);

        System.out.println("==========================================");

        Circle circle3 = new Circle(6.0);
        System.out.println("Circle1' radius: "+circle3.radius);
        System.out.println("Circle1' diameter: "+circle3.diameter);
        System.out.println("Circle1' area: "+circle3.area);
        System.out.println("Circle1' perimeter: "+circle3.perimeter);
        System.out.println("==========================================");

        System.out.println("Area: "+new Circle(6).area);
        System.out.println("Perimeter: "+ new Circle(6).perimeter);

        System.out.println("==========================================");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);



    }
}
