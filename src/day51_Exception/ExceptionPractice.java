package day51_Exception;

public class ExceptionPractice {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("World");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        System.out.println("How are you");
    }

    public static void sleep(int seconds) {
        System.out.println(seconds * 1000);
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }

    }
}
