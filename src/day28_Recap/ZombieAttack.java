package day28_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int count = 0, sum = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

        do {
            for (int i = 0; i < inhabitants.length; i++) {
                if (i < inhabitants.length - 1) {
                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                        inhabitants[i] /= 2;
                    }
                    if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                        inhabitants[i + 1] /= 2;
                        i += 1;
                    }
                }
            }
            sum = 0;
            for (int n : inhabitants)
                sum += n;

            count++;
            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        } while (sum > 0);
        System.out.println("---- EXTINCT ----");

    }
}
