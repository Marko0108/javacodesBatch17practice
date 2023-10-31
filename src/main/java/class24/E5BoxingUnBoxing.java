package class24;

/*
from primitive to object class = boxing
 */


public class E5BoxingUnBoxing {
    public static void main(String[] args) {
        int a=10;
        Integer number=new Integer(a);
        int d=number.intValue(); // converting from a class to a primitive  = unboxing
        System.out.println(d);

        Integer c=10;  // AutoBoxing
        int f=c; // AutoUnboxing
        System.out.println(f);
    }
}
