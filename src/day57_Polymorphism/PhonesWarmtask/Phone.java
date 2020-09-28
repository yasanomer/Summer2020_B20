package day57_Polymorphism.PhonesWarmtask;
/*
  3. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()

            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
 */
public abstract class Phone {
 public String brand;
 public String model;
 public double price;
 public double size;

 public abstract void calling (long phoneNumber);
 public abstract void texting (long phoneNumber);

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public Phone (String brand, String model, double price,double size){
        if(price<0){
            throw new RuntimeException("Invalid Price, cannot be negative");
        }
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;


    }

}
