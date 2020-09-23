package day54_Abstraction.Phones;

public class Iphone extends Phone {
    public Iphone (String brand , String model ,double size , double price){
        this.brand=brand;
        this.model=model;
        this.size =size;
        this.price=price;
    }
    @Override
    public void call (long number){
        System.out.println(brand+" "+"is calling to "+ number);
    }
    @Override
    public void text (long number){
        System.out.println(brand+" "+"is text to "+ number);
    }
    public void faceTime(long number) {
        System.out.println(brand + " " + model + " is Facetime to " + model);
    }

    public void selfie() {
        System.out.println("Taking great selfies using " + brand + " " + model);
    }
}
