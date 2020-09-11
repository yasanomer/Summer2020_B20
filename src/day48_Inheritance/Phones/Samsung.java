package day48_Inheritance.Phones;
/*
 creata a subclass of Phone called Samsung
				initialize all the variables using constructor & static block
				methods: call, text, selfie, setInfo, toString, freeze
 */
public class Samsung extends Phone {
    public static String brand;
    public static String madeIn;
    public static String OS;

    static {
        brand="Samsung";
        madeIn="South Korea";
        OS="Android";
    }
/*
    public void call (long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    public void text (long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }

 */
    public void selfie (){
        System.out.println("Selfie: "+brand);
    }
    public Samsung (String model,double price , String screenSize){
       setInfo(model,price,screenSize);
    }
    public String toString (){
        return "============================"+
                "\nModel: "+model+
                "\nScreen Size: "+screenSize+
                "\nPrice: "+price+
                "===========================";

    }
    public void freeze(){
        System.out.println("Freeze: "+brand);
    }


}
