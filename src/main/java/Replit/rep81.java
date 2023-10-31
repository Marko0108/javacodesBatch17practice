package Replit;
/*
**For you to do:**
Write a program that prints the highest value in the array.
**Expected Output:**
input [5,4,8]
```
8
 */
public class rep81 {
    public static void main(String[] args) {
        int[] input= {5, 4, 8};

        int highestValue=input[0];

        if (input[0] >= highestValue) {

            highestValue = input[0];
        }
        if (input[1] >= highestValue) {

            highestValue = input[1];
        }
        if (input[2] >= highestValue) {

            highestValue = input[2];
        }
        System.out.println(highestValue);

    }
}
