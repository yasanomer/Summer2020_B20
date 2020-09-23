package day54_Abstraction.ShapesTask;

public class Rectangle extends Shape{
    double length ;
    double width ;

    public Rectangle (double length, double width){
        this.length=length;
        this.width=width;

    }
    @Override
    public void area (){
        System.out.println("Rectangle area is : "+ length*width);
    }



}
