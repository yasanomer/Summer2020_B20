package day58_Polymorphism.DeviceTask;

import day12_Switch_Scaner.SomeOfTwoNumber;

/*
	5. create a class called Phone Objects and test every single methods of each phone objects
 */
public class PhoneObjects {
    public static void main(String [] args){
       Iphone iphone = new Iphone("Apple","12","5.6",1200);
       Samsung samsung = new Samsung("Samsung","S20","6.1",899);

        System.out.println(iphone);
        System.out.println(samsung);
    }
}
