package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName=scanner.nextLine();    //next umjesto nextLine preskoci sledeci red ponovi prethodni - buffering
        System.out.println("Enter your City");
        String city=scanner.nextLine();
        System.out.println(fullName+" "+city);


    }
}
