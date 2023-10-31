package class29;

import java.util.Scanner;

public class E5Exceptions {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
    try {

            //plan A
            int size = scanner.nextInt();
            int[] arr = new int[size];
        }catch (Exception e){
        //plan B
        System.out.println("User must only enter a positive integer number");
    }

        System.out.println("2");
        System.out.println("3");
        System.out.println("4");



    }
}
