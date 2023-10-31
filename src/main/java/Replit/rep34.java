package Replit;

import java.util.Scanner;

/*
Write a program to find the largest number among three
distinct numbers using nested if condition
Please use Scanner class to take input from users
**Expected Output:**
```
Please enter 3 distinct numbers 4 5  and 14
```
```
The largest number is 14
 */
public class rep34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();

        if (number1>number2) {
            System.out.println("The largest number is "+number1);//ili bez drugog if/ if (number1>number2 && number1>number3)
           if (number1>number3){
               System.out.println("The largest number is "+number1);}
        } else if (number2>number1) {
            System.out.println("The largest number is "+number2);

        } else{
            System.out.println("The largest number is "+number3);
        }


    }
}
