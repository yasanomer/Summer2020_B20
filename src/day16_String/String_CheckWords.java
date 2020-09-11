package day16_String;
/*
write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less or equal 3 characters, print the string itself
 */

public class String_CheckWords {
    public static void main(String[] args) {
        String str = "ABC";
        // last index =  length -1
        // second last index = length -2
        // third last index = length -3

        if(str.length() == 0){
            System.out.println("empty string");
        }else if(str.length() > 3){
            System.out.println( str.substring( str.length()-3 )   );
        }else{
            System.out.println(str);
        }

        String result =  (str.length() == 0) ? "empty string"
                : (str.length() > 3) ? str.substring( str.length()-3 ) : str ;


        System.out.println(result);
    }

}
