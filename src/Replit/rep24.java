package Replit;

import java.util.Scanner;

/*
Write a program that takes a user's name and prints it.
**Example Output:**
```
Hello, please enter your name
```
```
Your name is Sumair
 */
public class rep24 {
    public static void main(String[] args) {
        String name="Sumair";
        System.out.println("Hello, please enter your name");
        Scanner scanner=new Scanner(System.in);
        name= scanner.nextLine();
        System.out.println("Your name is "+name);




    }
}
