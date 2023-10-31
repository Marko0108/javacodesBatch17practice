package groupProjectCodingTasks;

import java.util.Scanner;

/*
6. Write a java program to check whether a given
number is prime or not
 */
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("This number is not a prime number");
        } else
            System.out.println("This number is a prime number");
    }
    }

