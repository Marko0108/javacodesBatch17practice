package class29;

public class E6Exceptions {
    public static void main(String[] args) {

        System.out.println("1");


    try {
        //place code that might throw an exception

        //System.out.println(10/0);

        /*String name=null;
        name.length();*/

        int[] arr=new int[-5];

        }catch (ArithmeticException e){                   //  name of the class - name of exception
        System.out.println("Don't divide by zero");

    }catch (NullPointerException e){                         //  name of the class - name of exception
        System.out.println("Check if you stored the null value in the variable");
    }
    catch (Exception e){                                    //parent of all classes of exceptions
        System.out.println("Something went wrong contact pratyush");
    }


    }
}
