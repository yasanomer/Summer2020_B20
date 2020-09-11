package day46_ConstuctorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3 (){
        System.out.println("X");
    }
    public ConstructorCalls3 (int a){
        this();
        System.out.println("Y");
    }
    public ConstructorCalls3(double a){
       // this();   one constructor can only call one constructor maximum
        this(10);

    }

    public void method1 (){
        // ConstructorCalls3 (); // cannot be called by name
       // this();// can only be used inn a constructor

    }

}
