package day11_NestedIf_Ternary;
/*

            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
         */

import org.w3c.dom.ls.LSOutput;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 8;
        boolean validNumber = day >= 1 && day <= 7;
        String result = "";
        if (validNumber) {
            if (day == 7) {
                result = "Sunday";
            } else if (day == 6) {
                result = "Sunday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 1) {
                result = "Tuesday";
            } else
                result = "Monday";
        } else {
            result = "Invalid";
            System.out.println(result);
        }
    }

}
