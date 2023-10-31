package Replit;

import java.util.Scanner;

/*
Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
If the result is true then prompt user with question: "What is your credit score?".
Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" .
**Output:**
```
The eligibility is ____
```
 */
public class rep35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");

        boolean question=true;
        question=scanner.nextBoolean();

        if (question==true) {
            System.out.println("What is your credit score?");

            int scoreEligibility= scanner.nextInt();

            if (scoreEligibility < 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (scoreEligibility >= 600 && scoreEligibility <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (scoreEligibility > 700 && scoreEligibility <= 800) {
                System.out.println("The eligibility is Eligible");
            } else if (scoreEligibility > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
                System.out.println("Unknown");
            }

        }

        }


