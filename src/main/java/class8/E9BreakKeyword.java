package class8;

import java.util.Scanner;

// break keyword stops loop when finds correct value
public class E9BreakKeyword {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        double total=0;
        while (true){
            System.out.println("Please enter the price of the item -1 to terminate");
            double price= scanner.nextDouble();
            if (price==-1){
                break;
            } else {
                total=total+price;
            }
            System.out.println("Your total bill is "+total);
        }
        }
    }


