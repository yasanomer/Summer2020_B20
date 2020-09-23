package day56_Abstraction.PhonaTask;

import day56_Abstraction.PhonaTask.Phone;

public final class Samsung extends Phone {


    public Samsung(String brand, String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price<=0 || price >1200){
            throw new RuntimeException("Invalid price "+price);
        }

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);

    }

    @Override
    public void calling(long num1, long num2) {

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {

    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
