package day32_MethodOverloading;
import java.util.Arrays;
public class Combine2ArraysChar {
    public static void main(String[] args) {
        char [] arr1 = { 'a','c','d'};
        char [] arr2 = { 'b','e','f'};

        char [] arr3 =combine2ArraysChar(arr1,arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }





    public static char [] combine2ArraysChar (char [] arr1 , char [] arr2 ){
        char [] arr3 = new char[arr1.length + arr2.length];

        int i =0 ;
        for ( char each : arr1){
            arr3[i]= each;
            i++;
        }
        for ( char each : arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
}
