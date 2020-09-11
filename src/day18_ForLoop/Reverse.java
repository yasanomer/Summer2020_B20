package day18_ForLoop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Java";

        String s1 = str.substring(1);
        String s2 = str.substring(0,1);
        String res= s1 +s2;
        System.out.println(res);

        char ch= str.charAt(0);
        System.out.println(s1+ch);
    }
}
