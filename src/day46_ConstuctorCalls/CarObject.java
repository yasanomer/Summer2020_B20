package day46_ConstuctorCalls;

public class CarObject {
    public static void main(String[] args) {
        System.out.println(new Car("VW"));

        System.out.println("=================");
        System.out.println(new Car("Volvo","xc90"));
        System.out.println("=================");
        System.out.println(new Car("Jeep","Grand Chorake","Red"));
        System.out.println("=================");
        System.out.println(new Car("BMW","R1200GS","Black",2018));
        System.out.println("=================");
        System.out.println(new Car("Jaguar","x6","White",2020,35000));
        System.out.println("=================");


    }

}
