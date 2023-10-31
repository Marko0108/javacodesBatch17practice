package Replit;

import java.util.Scanner;

/*
Prompt user with questions: "Please enter your favorite car make"
- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"
```
The output of your program should be:
```
"Your favorite car is ___"
 */
public class rep44 {
    public static void main(String[] args) {
        System.out.println("Please enter your favorite car make");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String carOrigin="";
        switch (input){
            case "BMW":
                carOrigin="german car";
                System.out.println("Your favorite car is "+carOrigin);
                break;
            case "Toyota":
                carOrigin="japanese car";
                System.out.println("Your favorite car is "+carOrigin);
                break;
            case "Maserati":
                carOrigin="italian car";
                System.out.println("Your favorite car is "+carOrigin);
            break;
            default:
                carOrigin="unknown";
                System.out.println("Your favorite car is "+carOrigin);
        }


    }
}
