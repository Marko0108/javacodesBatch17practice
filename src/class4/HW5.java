package class4;

import java.util.Scanner;

/*
Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus,
otherwise he is not.
Once user is eligible and salary is larger than 50000 than bonus = 5000,
otherwise bonus=3000.
*/
public class HW5 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers of worked years");
        int numberOfWorkedYears=scanner.nextInt();
        System.out.println("Enter your annual salary");
        double annualSalary=scanner.nextDouble();
        if (numberOfWorkedYears>=5){
            System.out.println("You are available for bonus");
            if (annualSalary>=50000){
                System.out.println("Bonus will be 5000");
            }else {
                System.out.println("Bonus will be 3000");
            }
        }


        else {
            System.out.println("You are not available for bonus");
        }


    }
}
