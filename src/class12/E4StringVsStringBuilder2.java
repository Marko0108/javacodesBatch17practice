package class12;

public class E4StringVsStringBuilder2 {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
    }
}
