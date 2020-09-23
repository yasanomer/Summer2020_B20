package day54_Abstraction.Phones;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Apple","X",5.6,900);
        iphone.call(12345677);
        iphone.text(12345677);
        iphone.faceTime(12345677);
        iphone.selfie();
        System.out.println("==========================");

        Samsung samsung = new Samsung("Samsung","S10",6,700);
        samsung.call(7654321);
        samsung.text(7654321);
        samsung.freezing(7654321);
        samsung.selfie();
        System.out.println("==========================");
        Nokia nokia = new Nokia("Nokia","3210",4.7,300);
        nokia.call(3214567);
        nokia.text(3214567);
        nokia.smart();

    }
}
