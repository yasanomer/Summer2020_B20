package day32_MethodOverloading;
import java.util.Arrays;
public class Combine2ArraysDouble {

    //create a method that can combine 2 arrays of double
    public static void main(String[] args) {
        double [] a1 ={1.2, 3.2, 4.5};
        double [] a2 ={1.1, 2.2, 3.3};


        double [] a3 = combine2ArraysDouble(a1,a2);
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));


    }



    public static double [] combine2ArraysDouble (double [] arr1 ,double [] arr2 ){
        double [] arr3 = new double[arr1.length + arr2.length];
        int  i=0;
        for (double each : arr1){
           arr3 [i] = each;
            i++;
        }
        for (double each : arr2){
            arr3 [i] = each;
            i++;
        }
        return arr3;
    }


}
