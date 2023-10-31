package class19;

public class Calculator {

    public void add(int num1, int num2){                    //overloading only changing parameters (u zagradi)
        System.out.println(1);
        System.out.println(num1+num2);
    }         // add(int num1, int num2)  signature of the method - name of the method+parameters
              // public void add(int num1, int num2)  header of the method         interview question
    public void add(int num1, int num2, int num3) {    // copy paste daje error, kad dodam int num3 nema error
        System.out.println(2);
        System.out.println(num1 + num2+num3);
    }

    public void add(double num1, double num2){
        System.out.println(3);
        System.out.println(num1+num2);
    }

    public void add(int num1, double num2){
        System.out.println(4);
        System.out.println(num1+num2);
    }
    public void add(double num1, int num2){
        System.out.println(5);
        System.out.println(num1+num2);
    }

}
