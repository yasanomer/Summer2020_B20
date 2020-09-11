package day12_Switch_Scaner;

public class Switch_Practice2 {
    public static void main(String[] args) {
        String productName = "Ipad";
        switch (productName){
            case "galaxy":
                System.out.println("Samsung");
                break;
            case "Iphone":
            case "Ipad":
            case "MacBook":
                System.out.println("Apple");
                break;
        }
    }
}
