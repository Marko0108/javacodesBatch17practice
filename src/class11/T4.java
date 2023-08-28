package class11;
//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
public class T4 {
    public static void main(String[] args) {

        String str="I dont like java";

        System.out.println(str.replaceAll("\\s",""));

        }

    }


