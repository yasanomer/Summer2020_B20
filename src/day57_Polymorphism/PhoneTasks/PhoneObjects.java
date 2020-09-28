package day57_Polymorphism.PhoneTasks;

public class PhoneObjects {


    public static void main(String[] args) {

        IPhone iPhone = new IPhone("12","5.3",1100);
        Samsung samsung = new Samsung("S20","6.1",899);
        Huawei huawei = new Huawei("Robbery","5.3",25);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(huawei);

    }
}
