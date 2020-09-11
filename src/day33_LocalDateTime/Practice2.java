package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

        String [] students = {"victor", "Alim", "Selman" ,"Hank", "Nilufer"};
        LocalDate[] birthDays = {LocalDate.of(1982, 12, 26),
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1980, 1, 3),
                LocalDate.of(1991, 5, 2),
                LocalDate.of(1985, 7, 11)
        };

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");


        //  Odina :  May/23/80 Monday

        for(int i =0; i <= students.length-1; i++){
            System.out.println(students[i]+" : "+ birthDays[i].format(dateFormat) );
        }



    }



    }
