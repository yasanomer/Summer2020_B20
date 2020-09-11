package day48_Inheritance.Phones;
/*
2. create a subclass of Phone called iPhone
				initialize all the variables using constructor & static block
				methods: call, text, selfie, setInfo, toString, faceTime
 */
    public class iPhone extends Phone {

    public static String brand;
    public static String madeIn;
    public static String OS;
    public static boolean hasFaceTime;

    static {
         brand="Apple";
         madeIn="China";
         OS="IOS";
         hasFaceTime=true;

    }
    // call and text inherited
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

    public iPhone (String model,double price , String screenSize){
    setInfo(model,price,screenSize);

    }

    public String toString (){
        return "============================"+
                "\nModel: "+model+
                "\nScreen Size: "+screenSize+
                "\nPrice: "+price+
                "\nFacetime:"+hasFaceTime+
                "\n===========================";

    }


    public void faceTime(){
        System.out.println("Facetime: "+model);
    }


}
