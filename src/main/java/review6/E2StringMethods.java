package review6;

public class E2StringMethods {
    public static void main(String[] args) {

        String str = "This is a java class";
        boolean starts = str.startsWith("T");
        int num = 'a';  //ascii table
        System.out.println(num);
        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("java"));

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(97));
        // String.valueOf(12);
        char c = str.charAt(8);
        System.out.println(c);
    }
    }