package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String [] days= new String[7];

        days [0] = "Monday";
        days [1] = "Tuesday";
        days [2] = "Wednesday";
        days [4] = "Friday";
        days [5] = "Saturday";
        days [3] = "Thursday";
        days [6] = "Sunday";

        for (int i=0; i<=days.length-1; i++){
            System.out.print(days[i]+" ");
        }
        System.out.println();

        System.out.println("====================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7");
        int n = scan.nextInt();
        System.out.println("Today is "+ days[n-1]);


    }
}
