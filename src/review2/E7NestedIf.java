package review2;

public class E7NestedIf {
    public static void main(String[] args) {

        String day = "Sunday";   //put Saturday for more complex output
        double accountBalance = 5000;
        //== equals()  za primitive za non primitive != !equals()
        if (day.equals("Sunday")) {

            if (accountBalance > 2000) {
                System.out.println("We can buy this");
            } else {
                System.out.println("Its too expensive");
            }

        } else if(day.equals("Saturday")){
            System.out.println("Its Saturday lets do for dinner");
        } else {
            System.out.println("Lets wait for Sunday");
        }
    }
}
