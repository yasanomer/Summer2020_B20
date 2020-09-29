package day58_Polymorphism.DeviceTask;
/*
	4. create a subclass of Phone called Samsung (meant to be sub class ONLY) that can inherit from AndroidApp

			Add a constructor with three arguments of model, screenSize, price
				call the super class' constructor to initialize all the fields


			Methods:
				call(long number)
				text(long number)
				equal(Device device): returns true if the given argument is Samsung and its model equal to instance variable model
				download()
				toString()
 */
public class Samsung extends Phone implements AndroidApp{
    public Samsung(String brand, String model, String screenSize, double price) {
        super(brand, model, screenSize, price);
    }
    @Override
    public void download() {
        System.out.println("Samsung is downloading app from "+AppStoreName);
    }
    @Override
    public void calling(long number) {
        System.out.println("Samsung is calling "+number);
    }

    @Override
    public void texting(long number) {
        System.out.println("Samsung is texting "+number);
    }

    @Override
    public void equal(Device device) {

    }

    @Override
    public void device() {

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", price=" + price +
                '}';
    }
}
