package day54_Abstraction.Phones;

public class Samsung extends Phone {
    public Samsung (String brand , String model ,double size , double price){
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
    public void freezing(long number) {
        System.out.println(brand + " " + model + " is  Freezing very often " + model);
    }

    public void selfie() {
        System.out.println("Taking great selfies using " + brand + " " + model);
    }
}