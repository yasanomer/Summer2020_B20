package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String [] students = {"victor", "Alim", "Selman" ,"Hank", "Nilufer"};
        LocalDate [] birthDays = {LocalDate.of(1982, 12, 26),
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1980, 1, 3),
                LocalDate.of(1991, 5, 2),
                LocalDate.of(1985, 7, 11)
        };

                for (int i = 0; i<= students.length-1;i++){
                    System.out.println(students[i] + " : "+ birthDays[i]);
                }
        System.out.println("======================");

                for (LocalDate each : birthDays){
                    if (!each.isLeapYear()){
                        continue;
                    }
                    System.out.println(each);
                }

    }
}
