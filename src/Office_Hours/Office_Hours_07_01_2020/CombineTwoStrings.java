package Office_Hours.Office_Hours_07_01_2020;

import java.util.Scanner;

/*
 Ask user to enter two words. Then add them together and print.
 But if the last letter if the first word and the first letter
 of the last letter is the same, print that character once.
                    Input:
                        one
                        eight

                    Output:
                        oneight

 */
public class CombineTwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words :");
        String str1 = input.next();
        String str2 = input.next();

        char ch1 = str1.charAt(str1.length()-1);
        char ch2 = str2.charAt(0);

        if (ch1==ch2){
            System.out.println(str1+str2.substring(1));
        }else {
            System.out.println(str1 + str2);
        }

        /* second solution
        String s1 = str1.substring( str1.length() -1 ); // "e"
                        // substring(2 ) ==> e

        String s2 = str2.substring(0, 1);  // "e"

        if( s1.equals(s2) ) {
            System.out.println( str1 + str2.substring(1) );
        }else{
            System.out.println(str1 + str2);
        }

         */

    }
}
