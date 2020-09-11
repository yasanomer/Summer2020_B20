package day24_Arrays;

import java.util.Scanner;

public class Array_Split {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String str = email.replace("@" ,", @ ," );
        int i1 = str.indexOf("@");
        System.out.println(str.charAt(i1));
        String str1 = email.substring(0,i1-2);
        String str2 =email.substring(i1-1);
        System.out.println("Email id: "+str1);
        System.out.println("Email domain: "+str2);



    }
}
