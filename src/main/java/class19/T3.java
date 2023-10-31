package class19;
/*
Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific
 arguments and observe result.
 */
public class T3 {

    public int min(int num1, int num2){

        //return  num1<num2?num1:num2;  ternary operator - if else condition shorter version
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
    public double min(double num1, double num2){

        //return  num1<num2?num1:num2;  ternary operator - if else condition shorter version
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
