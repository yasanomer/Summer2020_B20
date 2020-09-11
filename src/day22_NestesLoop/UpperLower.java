package day22_NestesLoop;

import java.util.Scanner;

/*
 Write a program that asks user to enter a string.
 If string started with uppercase and ends with lowercase letter then print true,
 otherwise print false
		Ex:
		   Input: Cybertek
		   output: true

		   Input: CyberteK
		   output: false
 */
public class UpperLower {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter String:");
        String word =s.next();

      char ch1 = word.charAt(0);
      char ch2 = word.charAt(word.length()-1);

      boolean start = ch1 >= 'A' && ch1<='Z';
      boolean end = ch2>= 'a' && ch2<='z';

        System.out.println( start && end);

        // 2. solution
//        if (start && end){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }


    }
}
