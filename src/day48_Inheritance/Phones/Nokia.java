package day48_Inheritance.Phones;
/*
4. create a subclass of Phone called Nokia
				initialize all the variables using constructor & static block
				methods: call, text, selfie, setInfo, toString, breakTheFloor
 */
public class Nokia extends Phone {

        public static String brand;
        public static String madeIn;
        public static String OS;
        public static boolean breakTheFloor;

        static {
            brand="Nokia";
            madeIn="China";
            OS="Symbian OS";

        }
        /*
    public void call (long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }


         */

    public void selfie (boolean yes){
        System.out.println("Selfie: "+yes);
    }

    public Nokia (String model,double price , String screenSize){
       setInfo(model,price,screenSize);
    }
    public String toString (){
        return "============================"+
                "\nModel: "+model+
                "\nScreen Size: "+screenSize+
                "\nPrice: "+price+
                "\nBreak the floor: "+breakTheFloor+
                "===========================";

    }
    public void breakTheFloor(){
        System.out.println("When you drop your " + brand +" on the floor, there will be crack on the floor" +
                ", but not on your " + brand);
    }


}


