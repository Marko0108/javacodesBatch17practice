package Replit;

import java.util.Scanner;

/*
Given the following inputs:
int x;
```
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
Sample input/outputs:
``
In: 7
6 5 4 3 2 1 0
```
In: 12
11 10 9 8 7 6 5 4 3 2 1 0
```
In: 20
19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
 */
public class rep65 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userInput= scanner.nextInt();
         for (int i=userInput-1; i>=0;  i--){
             System.out.print(i+" ");
         }
    }
}
