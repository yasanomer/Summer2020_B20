package day18_ForLoop;

public class Quiz {
    public static void main(String[] args) {

        String str7 = "I Like Java Language";
        //             0123456789

        String word = str7.substring(7, 10+1); //"Java"
        System.out.println( str7 );
        System.out.println(word);

        String str = "Batch 20";
        str.trim();
        boolean A =str.isEmpty();
        System.out.println(A);
        int z= str.trim().length();
        System.out.println(z);

    }
}
