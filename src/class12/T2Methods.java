package class12;
/*
Create a method that will take two int numbers as input and return the larger number call
the method in a different class and print the results
 */
public class T2Methods {
    int getLarger(int num1,int num2){
        int res;
        if (num1>num2){
            res=num1;
        }else {
            res=num2;
        }
        return res;
    }
}
