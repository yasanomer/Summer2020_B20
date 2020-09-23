package day54_Abstraction.ShapesTask;

public class Square extends Shape {
    double side ;
    public Square (double side ){
        this.side = side;
    }
    @Override
    public void area (){
        System.out.println("Square area is : "+ side*side);
    }

}
