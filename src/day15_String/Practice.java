package day15_String;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name ");
        String firstName= input.next();
        System.out.println("Enter last name ");
        String lastName= input.next();

        String fullName =firstName.concat(" "+lastName);
        System.out.println(fullName);

//        char ch1 = sentence.charAt(0);
//        System.out.println(ch1);
//        int lastIndex = sentence.length();
//        char ch2 = sentence.charAt(lastIndex-1);
//        System.out.println(ch1+""+ch2);



    }
}
