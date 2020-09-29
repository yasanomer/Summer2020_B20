package day58_Polymorphism.DeviceTask;
/*
6. create a subclass of Phone called Iphone (meant to be sub class ONLY) that can inherit from AppleApp
Add a constructor with three arguments of model, screenSize, price
call the super class' constructor to initialize all the fields
Methods:
call(long number)
text(long number)
faceTime(long number)
equal(Device device): returns true if the given argument is Iphone and its model equal to instance variable model
download()
toString()
 */
public final class Iphone extends Phone implements AppleApp {
    public Iphone(String brand, String model, String screenSize, double price) {
        super(brand, model, screenSize, price);
    }

    @Override
    public void device() {

    }

    @Override
    public void calling(long number) {
        System.out.println("Iphone is calling "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Iphone is texting "+number);
    }

    @Override
    public void equal(Device device) {

    }

    public void faceTime (long number){
        System.out.println("Iphone is FaceTiming "+number);
    }

    @Override
    public void download() {
        System.out.println("Iphone is download "+AppStoreName);
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", price=" + price +
                '}';
    }
}
