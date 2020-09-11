package day32_MethodOverloading;
import java.util.Arrays;
import java.util.Scanner;
public class Combine2ArraysInt {
    public static void main(String[] args) {



        int [] a2= {200, 400,40,30,400,60,78};
        int [] a1= {2,3,4,5};

        int [] arr = combine2Arrays(a1,a2);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int [] combine2Arrays (int  []arr1 , int  [] arr2 ){
        int [] arr3 = new int [arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1){
            arr3 [i] = each;
            i++;
        }
        for (int each : arr2){
            arr3 [i] = each;
            i++;
        }
        return arr3;
    }



}
