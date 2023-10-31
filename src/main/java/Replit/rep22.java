package Replit;

import java.util.Scanner;

/*
Write a program to take user name, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"

**Example Output:**
```
Enter your name
```
```
Enter your mobile number
```
```
Enter your age
```
```
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
```
 */
public class rep22 {
    public static void main(String[] args) {

        String name;
        String mobileNumber;
        int age;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        name= scanner.nextLine();

        System.out.println("Enter your mobile number");
        mobileNumber=scanner.nextLine();

        System.out.println("Enter your age");
        age= scanner.nextInt();


        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobileNumber);



    }
}
