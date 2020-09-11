package Office_Hours;

import java.util.Arrays;

public class Array_Descending2 {
    public static void main(String[] args) {
        int [] arr = {98, 97 , 100 , 200, 55, 68,79};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int []descArr = new int[arr.length];

        int j = arr.length-1;

        for (int each : arr){
            descArr [j]=each;
            j--;
        }
        System.out.println(Arrays.toString(descArr));
    }
}
