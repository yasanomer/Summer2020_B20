package day47_Encapsulation;

/*
1. create class Credentials
			instance variables:
					public name
					public age
					private username
					private password

					getter & setter

					add a constructor to set name & age
 */
public class Credentials {
    public String name;
    public int age;
    private String userName;
    private String passWord;

    public static String companyName;

    static {
        companyName = "Facebook";
    }

    public Credentials (String name,int age){
    this.name = name ;
    this.age = age;


    }
    public void setUsername (String userName){
        this.userName = userName;

    }
    public void setPassWord (String passWord){
        this.passWord = passWord;
    }
    public String getUserName (){
        return userName;
    }
    public String getPassWord(){
        return passWord;
    }


}
