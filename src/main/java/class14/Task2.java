package class14;
/*
Created a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.

 */
public class Task2 {
    public static String reverseStr (String inputStr) {


    String reversed="";
    for (int i = inputStr.length()-1; i>=0 ; i--) {
        reversed=reversed+inputStr.charAt(i);
    }
    return reversed;
}
}

