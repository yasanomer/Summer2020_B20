package day51_Exception.Browsers;
/*
    1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
 */
public class WebDriver {
  public void get(String URL){
      System.out.println("Opening the "+URL+" in the default browser");
  }
  public void close(){
      System.out.println("closes the default browser");
  }
}
