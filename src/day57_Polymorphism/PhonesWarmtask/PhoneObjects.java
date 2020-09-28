package day57_Polymorphism.PhonesWarmtask;


public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iPhone = new iPhone("Apple","11 Pro",900,5.6);
        System.out.println(iPhone);
        iPhone.calling(1234567);
        iPhone.texting(1234567);
        iPhone.faceTiming(1234567);





    }
}
