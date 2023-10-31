package review10;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //Cat act => act act
        String s1="listen";
        String s2="silent";

        char[] c1=s1.toLowerCase().toCharArray();//{c,a,t}                interview q
        char[] c2=s2.toLowerCase().toCharArray();//{a,c,t}

        Arrays.sort(c1);    //{a,c,t}
        Arrays.sort(c2);    //{a,c,t}
        boolean isAnaGram=Arrays.equals(c1,c2);
        System.out.println(isAnaGram);

       /* BigInteger b=new BigInteger("555555555555555555555444444444445555555555555555555555555555554444444444");
        b.add(new BigInteger("1"));
        System.out.println();

        */

    }
}
