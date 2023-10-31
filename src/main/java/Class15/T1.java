package Class15;
/*
Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1
 */
public class T1 {

    private String address;

    public T1(String userAddress){
        address=userAddress;
        System.out.println("Executed constructor with parameter "+userAddress);
    }

    public T1(){
        System.out.println("Executed constructor with No parameter");
    }

    public static void main(String[] args) {
        new T1();
        new T1("Canada");
    }


}

