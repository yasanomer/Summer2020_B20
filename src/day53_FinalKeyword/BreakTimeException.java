package day53_FinalKeyword;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("It's time for a break");
        System.err.println("Time to take 15 minutes break");
    }

    public BreakTimeException (String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }


    //comment
    //comment2
    //comment3
    //comment4

//comment5


}

class Test{

    public static void main(String[] args) {

        //throw new RuntimeException("This is Runtime exception");
        //   throw new BreakTimeException("You need to give us a break");

        //   System.out.println("Test Completed");

        //   throw new Test();


        throw new BreakTimeException("It's been 45 minutes");

    }

}
