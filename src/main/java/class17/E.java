package class17;
/*
Write program for to inherit class E that has method printF which is static and call or reuse that method into class F
 */
public class E {
    static String name="Jamel";
    static void printF(){
        System.out.println("f");
    }
}

class Eff extends E{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }
}
