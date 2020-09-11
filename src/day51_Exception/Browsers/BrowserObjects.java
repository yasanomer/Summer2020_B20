package day51_Exception.Browsers;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome= new ChromeBrowser();
        FireFoxBrowser fireFox = new FireFoxBrowser();
        OperaBrowser opera = new OperaBrowser();
        WebDriver chrome2= new ChromeBrowser();
        WebDriver chrome1=new WebDriver();

        chrome.get("https://www.google.com/");
        chrome.close();
        System.out.println("===============================>>");
        chrome1.get("https://www.google.com/");
        chrome1.close();
        System.out.println("===============================>>");
        chrome2.get("https://www.google.com/");
        chrome2.close();
        System.out.println("===============================");
        fireFox.get("https://www.google.com/");
        chrome.close();
        System.out.println("===============================");
        opera.get("https://www.google.com/");
        opera.close();

    }

}
