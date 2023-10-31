package class14;

public class BankAccountPrivate {
    private String name="Fahim";
    private String userName="Fahim123";
    private String password="pass123";
    private double accountBalance=300;
   private String accountNumber="12345";

    private void printInfo(){
        System.out.println("I am Fahim from batch 17");
    }
    public static void main(String[] args) {
        BankAccountPrivate bankAccount=new BankAccountPrivate();
        System.out.println(bankAccount.name);
    }
}
