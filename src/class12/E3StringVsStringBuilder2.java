package class12;

public class E3StringVsStringBuilder2 {
    public static void main(String[] args) {

    String name="Baber";
    name.toLowerCase();                         //immutable  stays Uppercase not changable because they are shared,
                                                //
        System.out.println(name);

        StringBuilder sb=new StringBuilder("Sunday");   // mutable
        sb.reverse();
        System.out.println(sb);
    }
}
