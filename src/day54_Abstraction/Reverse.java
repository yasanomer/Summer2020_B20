package day54_Abstraction;

public class Reverse {
    public static void main(String[] args) {
        String str = "evelin";
        System.out.println(StrReverse(str));

    }


    public static String StrReverse (String str){
        String reverse ="";
        for (int i=str.length()-1;i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }


}
