package day54_Abstraction.Phones;

public abstract class Phone {
    String brand ;
    String model ;
    double size ;
    double price ;
    public abstract void call (long number);
    public abstract void text (long number);


}
