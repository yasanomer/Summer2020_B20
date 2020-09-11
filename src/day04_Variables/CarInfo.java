package day04_Variables;

import javax.management.modelmbean.ModelMBean;
import java.time.Year;

public class CarInfo {

    /*
        Year
        Brand
        Model
        Milleage
        Price
        print the info of the car

        out :
        2020 BMW X5, 3000 miles, $45000

        */
    public static void main(String[] args) {
       int Year = 2020;
       String Brand = "BMW";
       String Model = "X5";
       int Mileage = 3000;
       double Price = 45000;
       String color = "Black";

        System.out.println(Year+" "+ Brand+" "+Model+""+Mileage+" miles, $"+Price);


    }




    }

