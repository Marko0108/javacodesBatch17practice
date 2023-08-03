package class4;

/*
Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into
celsius and print “The temperature is the city  is ”
 */

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your city name");
        String city= scanner.nextLine();
        System.out.println("Please enter your city temperature in farenheit");
        double temp= scanner.nextDouble();
        double convertFtoC=((temp-32)*5)/9; //  conversion formula
        System.out.println("Temperature of your city is "+convertFtoC);




    }

}
