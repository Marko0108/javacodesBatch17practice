package class5;

import java.util.Scanner;

public class T1Switch {
    public static void main(String[] args) {

        System.out.println("Enter your country");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        country=country.toLowerCase();

        switch (country) {
            case "brazil":
                System.out.println("portuguese");
                break;

            case "mexico":
                System.out.println("spanish");
                break;
            case "india":
                System.out.println("hindi");
                break;
            default:
                System.out.println("Country not supported");





        }
    }
}