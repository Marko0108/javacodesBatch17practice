package class10;

public class E1StringDemo {
    public static void main(String[] args) {
        //we have created an object from the String class and have stored
        //Cat inside it.
        String obj=new String("Cat");
        //Shortcut to created obj from String class
        String obj2="Dog";// String obj2=new String("Dog")
        int len=obj.length();
        System.out.println(len);
    }
}
