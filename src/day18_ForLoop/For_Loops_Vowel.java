package day18_ForLoop;
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue
 */
import java.util.Scanner;

public class For_Loops_Vowel {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("In: ");
        String word = inp.nextLine();

        for (int i=0; i<= word.length()-1 ; i++){
            if(word.charAt(i)== 'a' ||word.charAt(i)== 'A'){
                System.out.print(word.charAt(i));
            }else if(word.charAt(i)== 'e'||word.charAt(i)== 'E') {
                System.out.print(word.charAt(i));
            }else if(word.charAt(i)== 'o'||word.charAt(i)== 'O') {
                System.out.print(word.charAt(i));
            }else if(word.charAt(i)== 'i'||word.charAt(i)== 'I') {
                System.out.print(word.charAt(i));
            }else if(word.charAt(i)== 'u'||word.charAt(i)== 'U') {
                System.out.print(word.charAt(i));
            }
        }


    }
}
