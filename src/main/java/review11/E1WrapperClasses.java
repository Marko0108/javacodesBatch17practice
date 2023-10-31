package review11;

public class E1WrapperClasses {
    public static void main(String[] args) {

        int a=10;
        double b=a;
        System.out.println(b);

        int f=30;                       //converting primitive datatype to their wrapper class - boxing
        Integer g=f;
        System.out.println(g);

        double u=30.5;
        Double t=u;
        System.out.println(u);

        String name ="dnfjdnf";

        Boolean o=false;
        boolean s=o.booleanValue();                        //unboxing - from wrapper to primitive  normal unboxing
                                                //boolean s=o;   auto unboxing
    }
}
