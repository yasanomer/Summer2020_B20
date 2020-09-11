package day24_Arrays;

import java.util.Scanner;

/*
	1. write a program that can find the unique characters from a String
		Ex:
			input: aabccd
			output: bd
 */
public class Unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String uniques = "";
        for (int i=0 ; i<=str.length()-1;i++){
            char ch= str.charAt(i);
            int first =str.indexOf(ch);
            int last = str.lastIndexOf(ch);
         if (first==last){
             uniques+=ch;
         }
        }
        System.out.println(uniques);

    }
}
