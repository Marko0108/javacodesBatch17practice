package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name=scanner.next();
        if (name.equals("Jamel")){
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Habib")) {
            System.out.println("jailed by wife");

        }
    }
}
