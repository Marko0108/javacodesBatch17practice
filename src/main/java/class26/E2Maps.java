package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {

        /*
        order will be maintain here
         */

        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(10,"Adam");
        students.put(20,"Ehab");
        students.put(300,"Marta");
        students.put(45,"Ahmed");
        System.out.println(students);
        students.remove(300);
        System.out.println(students);       //remove keys and index automaticly
        students.replace(20,"Jamel");
        System.out.println(students);
    }
}
