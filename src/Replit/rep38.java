package Replit;

import java.util.Scanner;

/*
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
```
Today you will be learning ____
 */
public class rep38 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");

        boolean weekend=scanner.nextBoolean();

        if (!weekend) {
            System.out.println("Today you will be learning manual testing");
        }
        else{
            System.out.println("Today you will be learning Java");
        }
    }
}
