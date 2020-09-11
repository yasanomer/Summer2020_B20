package day48_Inheritance.Phones;
/*
create a class called Phone
				instance variables: model, price, screenSize
				static variables (DO NOT initialize them): brand, operatingSystem, madeIn
							No static block is need!

				methods: call, text, selfie, setInfo, toString
 */
public class Phone {
    public String model;
    public double price;
    public String screenSize;



    public void call (long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }

    public void selfie (boolean yes){
        System.out.println("Selfie: "+yes);
    }

    public void setInfo (String model,double price ,String screenSize){
        this.model=model;
        this.price=price;
        this.screenSize=screenSize;
    }


    public String toString (){
        return "============================"+
                "\nModel: "+model+
                "\nScreen Size: "+screenSize+
                "\nPrice: "+price+
                "===========================";

    }

}
