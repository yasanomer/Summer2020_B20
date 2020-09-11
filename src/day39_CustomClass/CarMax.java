package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus","RX350",2019,"Black",15000,38000);
        car2.setInfo("Audi","S5",2020,"White",5000,25000);
        car3.setInfo("VW","Atlas",2019,"White",23000,33000);
        car4.setInfo("GMC","Tolarode",2017,"Grey",27000,23000);
        car5.setInfo("Mercedes","GX350",2020,"White",1200,45000);

        car1.getInfo();
        car3.start();
        car5.start();

    }

}
