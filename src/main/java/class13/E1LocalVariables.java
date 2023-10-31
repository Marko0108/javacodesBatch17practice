package class13;

public class E1LocalVariables {
    public static void main(String[] args) {

        String name="Java";
        if (10>5){
            int age=23;
            System.out.println(name);
            System.out.println(age);
        }
        //System.out.println(age);     error jer je int unutar bloka coda if
        System.out.println(name);       // name je unutar main blocka gdje je kreirana varijabla

    }

}
