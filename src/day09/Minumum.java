package day09;

public class Minumum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aIsMin = a<b && a<c;
        boolean bIsMin = b<c && b<a;
        boolean cIsMin = c<a && c<b;
        //boolean cIsMin = aIsMin == false && bIsMin == false;

        double min = 0 ;
        if (aIsMin){
            min = a;
        }
        if (bIsMin){
            min =b;
        }
        if (cIsMin){
            min = c;
        }
        System.out.println(min+ " is the minimum number");

    }
}
