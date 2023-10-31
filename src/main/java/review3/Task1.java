package review3;

import java.util.Scanner;

/*
Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
Display the result to the user.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your first boolean value");
        boolean var1= scanner.nextBoolean();

        System.out.println("Please enter your second boolean");
        boolean var2= scanner.nextBoolean();

        if (var1&&var2){
            System.out.println("Both values are true");
        }else {
            System.out.println("Both value are not true");
        }



    }
}
