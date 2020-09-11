package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
/*
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color = "White";
        car1.mileage = 20000;
        car1.price = 19000.50;


 */
        car1.setInfo("Toyota","Corolla",2010,"Red",55000,12000);
        System.out.println(  );
        System.out.println( car1.model );
        System.out.println( car1.year );
        System.out.println( car1.color );

        System.out.println("=============================");
        Car car2 = new Car();
        car2.setInfo("BMW","X5",2010,"White",5000,20000);
        /*
        car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2000;
        car2.color = "Blue";

         */

        System.out.println( car2.brand  );
        System.out.println( car2.model  );
        System.out.println( car2.year  );
        System.out.println( car2.color  );
        System.out.println(car2.year+" "+car2.brand +", "+car2.model +", "+car2.color +", "+ car2.mileage+", $"+car2.price);

        Car car3 =new Car();
        car3.setInfo("Volvo","XC90",2020,"White",1000,55000);
        System.out.println(car3.year+" "+car3.brand +", "+car3.model +", "+car3.color +", "+ car3.mileage+", $"+car3.price);

        Car car4 =new Car();
        car4.setInfo("Jeep","Grand Chorake",2018,"Red",1000,30000);
        car4.getInfo();



    }

}





