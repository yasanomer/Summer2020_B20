package day18_ForLoop;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your sentence :");
        String input = s.nextLine();

        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--){
        reverse += input.charAt(i);

    }
        System.out.println(reverse);

    }
}
