package class19;
/*
Create a method to find the minimum of two numbers method will be passed two parameters and will return the minimum
number method should work with int and double data types.
Examples
min (10,5)=>5
min (2.5, 3.5)=>2.5

Use separate class to test your code
 */
public class T1 {

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
