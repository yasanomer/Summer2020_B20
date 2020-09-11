package day42_Static;

/*
 Create a class called Server

            Attributes:

                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
            	toString:

            	takeOrder(): server's name + "is taking an order"

            	cleanTable(): server's name + "is cleaning the table"

            	toString(): Returns (String) all the information of a Server
            		-> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */

public class Server {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime ;

    public void setInfo (String name, int employeeID , double hourlyRate , boolean fullTime ){
        this.name = name ;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime= fullTime;
    }
    public void takeOrder (String name){
        System.out.println(name+"is taking an order");
    }
    public void cleanTable (String name){
        System.out.println(name +"is cleaning the table");
    }
    public String toString (){
        return "\n Name: "+name + "  Employee ID: "+employeeID+ " Hourly Rate: "+hourlyRate +" Full Time :" + ((fullTime)?"full-time":"part-time");
    }

}
