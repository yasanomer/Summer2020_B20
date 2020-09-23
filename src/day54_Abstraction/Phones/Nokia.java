package day54_Abstraction.Phones;
public class Nokia extends Phone {
    public Nokia (String brand , String model ,double size , double price){
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
    public void smart () {
        System.out.println("Not smarts phone");
    }


}
