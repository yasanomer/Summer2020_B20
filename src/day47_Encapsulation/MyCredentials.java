package day47_Encapsulation;

public interface MyCredentials {
    public static void main(String[] args) {
        Credentials obj = new Credentials("Massimo",35);


        //obj.getUserName="Cybertek";
        obj.setUsername("Cybertek");
        obj.setPassWord("CyberTek12345");

       // System.out.println(obj.userName);
       // System.out.println(obj.passWord);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);


    }
}
