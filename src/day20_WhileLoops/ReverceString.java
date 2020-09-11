package day20_WhileLoops;

public class ReverceString {
    public static void main(String[] args) {
        String str = "Cybertek School";
        String result= "";
        int index = str.length()-1;
        while (index >=0){
            result += str.charAt(index);
            index--;
        }
        System.out.println(result);
    }
}
