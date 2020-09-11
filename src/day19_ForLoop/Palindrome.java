package day19_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println(" Enter your string :");
        String str = s.nextLine();

        String reverse ="";

        for (int i=str.length()-1; i>=0 ; i --){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(str.equals(reverse));
//        if (str.equals(reverse)){
//            System.out.println(true);
//        }else
//            System.out.println(false);

    }
}
