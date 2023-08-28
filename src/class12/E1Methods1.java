package class12;

import java.util.Scanner;

public class E1Methods1 {
    public static void main(String[] args) {

       /* // we are creating the object of Scanner class
        Scanner scanner=new Scanner(System.in);
        //using the scanner object we are calling the next Method
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");

        */
        takeUserInput();
        System.out.println("Please enter the details again");
        takeUserInput();


        }

    static void takeUserInput(){                       // void written type/ takeUserInput
        // we are creating the object of Scanner class
        Scanner scanner=new Scanner(System.in);
        //using the scanner object we are calling the next Method
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");

    }
}
