package Replit;

import java.util.Scanner;

/*
Given the following inputs:
```
int x;

Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
**Example Output:**

In: 3
```
0 1 2
```
In: 8
```
0 1 2 3 4 5 6 7
```
In: 5
```
0 1 2 3 4
```
 */
public class rep63 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int userInput= scanner.nextInt();


                for (int i=0; i<userInput; i++){
                    System.out.print(i+" ");

                }
            }


        }



