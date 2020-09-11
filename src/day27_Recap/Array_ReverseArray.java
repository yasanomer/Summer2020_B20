package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ReverseArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};



        for (int i =nums.length-1; i>=0 ; i--) {
//            System.out.print(nums[i] + " ");


        }

        System.out.println(Arrays.toString(nums));

    }
}

