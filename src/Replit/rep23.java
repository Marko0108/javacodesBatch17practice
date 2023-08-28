package Replit;

import java.util.Scanner;

/*
Create a program that will ask a user to input boolean value "Input the boolean value"
If the input is true or false, then the output should look like below:
**Example Output:**
```
Input the boolean value
```
```
The value is true
```
**Example Output:**
```
Input the boolean value
```
```
The value is false
 */
public class rep23 {
    public static void main(String[] args) {

        boolean value;

        System.out.println("Input the boolean value");
        Scanner scanner=new Scanner(System.in);
        value= scanner.nextBoolean();

        if (value==true) {
            System.out.println("The value is true");}
        value= scanner.nextBoolean();


        value= scanner.nextBoolean();

        if (value==false){

        System.out.println("The value is false");}

    }
}
