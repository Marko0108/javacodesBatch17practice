package class11;
/*
Create a String and print it in reverse order (Sunday yadnuS)
 */

public class E4StringMethodsTask22 {
    public static void main(String[] args) {

        String str="Sunday";

        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed = reversed + str.charAt(i);

        }
        System.out.println(reversed);
            }
        }




