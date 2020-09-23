package day54_Abstraction.ShapesTask;

public class Triangle extends Shape{
    double base ;
    double height ;
    public Triangle (double base ,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void area (){
        System.out.println("Triangle area is : "+(base*height)/2);
    }
}
