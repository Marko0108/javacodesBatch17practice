package class13;


public class E2StaticInstanceVariables3 {

    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println(E2InstanceVariables3.country);
        System.out.println();

        E2InstanceVariables3 e2=new E2InstanceVariables3();
        e2.printAge();
    }
}
