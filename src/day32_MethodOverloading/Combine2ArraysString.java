package day32_MethodOverloading;
import java.util.Arrays;
import java.util.Scanner;
//create a method that can combine 2 arrays of String
public class Combine2ArraysString {
    public static void main(String[] args) {
        String [] arr1 = {"Massimo","Ephesus","Jashua"};
        String [] arr2 = {"Zeus","Gab","John"};

        String [] arr3 =combine2ArraysString(arr1,arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }




    public static String [] combine2ArraysString (String [] arr1 , String [] arr2 ){
        String [] arr3 = new String[arr1.length+arr2.length];

        int i= 0;
        for (String each : arr1){
            arr3 [i] = each;
            i++;
        }
        for (String each : arr2){
            arr3 [i] = each;
            i++;
        }
        return arr3;
    }

}
