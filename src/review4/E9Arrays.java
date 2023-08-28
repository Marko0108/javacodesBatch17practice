package review4;

import java.util.Arrays;
import java.util.Scanner;

// combination scanner, arrays and loop

public class E9Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size= scanner.nextInt();
        int [] numbers =new int[size];                   // moze i int numbers [] =
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please Enter the number");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));

    }
}
