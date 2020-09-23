package day57;
/*
    5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()

             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */
public  class Samsung extends Phone implements AndroidAppStore {

    public Samsung(String brand, String model, double price, double size) {
        super(brand, model, price, size);
        if (price>1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }



    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public void downloadAndroidApp() {

    }
}
