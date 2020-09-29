package day58_Polymorphism.DeviceTask;
/*
1. create an abstract class called Device
variables: brand, model, screenSize, price
all variables are protected and final (DO Not initialize them yet)
abstract method: equal(Device device)
 */
public abstract class Device {
    public String  brand, model,screenSize;
    public double price;

    public Device(String brand, String model, String screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }

    public Device(String brand, String model, double price) {
    }

    public abstract void device ();

}
