package day57_Polymorphism.PhonesWarmtask;

/*
 4. create a class named IPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()

            if the price of Iphone is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */
public class iPhone extends Phone implements AppleAppStore {

    public iPhone(String brand, String model, double price, double size) {
        super(brand, model, price, size);
        if(price>1500 ){
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500 "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    public void faceTiming (long phoneNumber){
        System.out.println("Iphone is faceTiming with "+phoneNumber);
    }


    @Override
    public void downloadAppleApp() {

    }
}
