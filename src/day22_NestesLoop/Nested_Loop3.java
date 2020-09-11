package day22_NestesLoop;

public class Nested_Loop3 {
    public static void main(String[] args) {
        // ***** single line 5 times


        int j = 1;
        while (j <= 4) {
            for (int i = 1; i <= 10; i++) {
                System.out.print("*");
            }
            System.out.println();
            j++;
        }

    }
}
