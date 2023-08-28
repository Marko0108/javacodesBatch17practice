package class5;

import java.util.Scanner;

/*
Ask user to enter a number and define if number is small, medium or large
small number is value between 1 and 10
medium number is value between 11 and 100
large number is value between 101 and 1000
 */
public class TaskNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt();
        if (number>=1 && number<=10){
            System.out.println("Number is small");
        } else if (number>=11 && number<=100) {
            System.out.println("Number is medium");
        } else if (number>=101 && number<=1000) {
            System.out.println("Number is Large");
        } else {
            System.out.println("Wrong number");
        }

    }
}

