package day54_Abstraction.ShapesTask;
/*
circle:
		attributes: r
		area():
			r*r*PI

 */
public class Circle extends Shape {
double r;
final double pi= 3.14;
public Circle (double r){
    this.r=r;
}
@Override
public void area (){
    System.out.println("Square area is : "+ r*r*pi);
}


}

