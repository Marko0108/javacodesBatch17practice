package class4;

public class Task2 {
    public static void main(String[] args) {

        double mortgageRate = 4.1;
        double mortgagePrice = 50000;

        if (mortgageRate > 4.5) {

            System.out.println("User will not buy a house");
        }else {
            System.out.println("user will consider buying");
            if (mortgagePrice>50000){
                System.out.println("user will take a loan");
            }else {
                System.out.println("user will pay cash");
            }

        }
    }
}