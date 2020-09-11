package day12_Switch_Scaner;
/*
write a program that checks for the bigger of 3 numbers.
		you get 3 int variables: n1 , n2 and n3 (none of them are equal)
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			example:
					n1 = -2
					n2  = 2
					n3  = 1

				output: "n2 is bigger"

			NOTE: DO NOT USE IF STATEMENT

 */
public class BiggerNumber {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 200;
        double n3 = 300;
        boolean n1Bigger = n1>n2 && n1>n3;
        boolean n2Bigger = n2>n1 && n2>n3;
            //n1Bigger == false && n2>n3;
        String result="";

        if(n1Bigger){
            result="n1 is bigger";
        }else if (n2Bigger){
            result="n2 is bigger";
        }else {
            result="n3 is bigger";
        }
        System.out.println(result);

        System.out.println("================");
        String result1= (n1Bigger)?"n1 is bigger":(n2Bigger)?"n2 is bigger":"n3 is bigger";
        System.out.println(result);

    }
}
