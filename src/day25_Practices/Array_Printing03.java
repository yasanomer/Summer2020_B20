package day25_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Printing03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        arr[0] = input.nextLine();
        arr[1] = input.nextLine();
        arr[2] = input.nextLine();
        arr[3] = input.nextLine();
        arr[4] = input.nextLine();
        arr[5] = input.nextLine();
//        String [] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        int count=0;
        for (int i=0;i<=3;i++){

            System.out.println(arr [i]+" , "+arr [i+1]+" , "+arr [i+2]);
        }





    }
}
