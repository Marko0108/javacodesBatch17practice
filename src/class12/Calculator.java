package class12;

import java.util.Scanner;

public class Calculator {


       void add(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the first number");
            int num1= scanner.nextInt();
            System.out.println("Please enter the second number");
            int num2= scanner.nextInt();
            int sum=num1+num2;
           System.out.println("Sum of these numbers is "+sum);


        }

        void subtract(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the first number");
            int num1= scanner.nextInt();
            System.out.println("Please enter the second number");
            int num2= scanner.nextInt();
            int sum=num1-num2;
            System.out.println("Subtraction of these numbers is "+sum);

        }
        void multiply(){                        //void multiply(int number1, int number2) onda u Calculator
                                                    // test kucati calc.multiply(10,20)


           int number1=10;
           int number2=20;
           int result=number1*number2;
            System.out.println(result);
        }

    }

