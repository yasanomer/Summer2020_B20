package day51_Exception.Browsers;
/*
   4. create a class called Opera browser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
 */
public class OperaBrowser extends WebDriver {
    public void get(String URL){
        System.out.println("Opens the "+URL+" in Opera browser");
    }
    public void close(){
        System.out.println("Closes the Opera browser");
    }
}
