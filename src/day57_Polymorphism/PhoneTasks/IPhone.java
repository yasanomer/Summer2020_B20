package day57_Polymorphism.PhoneTasks;
/*
  5. create a class named IPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()

            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */
public class IPhone extends Phone implements AppleApp,Downloadable{

    public IPhone(String model, String size, double price) {
        super("Iphone", "11 Pro", "5.6", 1200);
        if(price>1500){
            throw new RuntimeException("Iphone price cannot be greater than 1500");
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
    public void download() {
        System.out.println("Iphone is download "+AppstoreName);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$ " + price +
                '}';
    }
}
