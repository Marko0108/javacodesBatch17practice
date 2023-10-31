package class19;
/*
Create a class CreditCard and define variable balance and interest. Create an instance method that will
calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest. Call the method by creating
an object of each of the three classes.



if there are no instance fields there is no points create constructors
 */
public class CreditCard {


    public void calculateInterest(double balance) {
        System.out.println(balance*0.05);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{

   @Override
    public void calculateInterest(double balance){
       System.out.println(balance*0.07);
    }
}
class TesterCreditCard {
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.calculateInterest(100);
        Visa v=new Visa();
        v.calculateInterest(100);
        AX ax=new AX();
        ax.calculateInterest(100);
    }

}



