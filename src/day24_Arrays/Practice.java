package day24_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note"};
        String[] word = new String[words.length];
        int i = 0;
        for (String each : words) {
            word[i] = each.substring(0, 1) + each.substring(each.length() - 1);
            ++i;
        }
        System.out.println(Arrays.toString(word));
    }


}







