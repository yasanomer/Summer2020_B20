package day51_Exception.Browsers;
/*
    3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
 */
public class FireFoxBrowser extends WebDriver {
    public void get(String URL){
        System.out.println("Opens the "+URL+"in Firefox browser");
    }
    public void close(){
        System.out.println("Closes the Firefox browser");
    }
}
