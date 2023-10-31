package class26;

import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Only print those countries which contain more than 5 letters in their country name and the
letter "a" in their capital names

 */
public class T21 {
    public static void main(String[] args) {
        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("Canada","Ottawa");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");
        countries.put("Egypt","Cairo");

        countries.forEach((k, v) -> {
            if (k.length()>5&& v.contains("a"))
            {System.out.println(k);}
        });
    }
}
