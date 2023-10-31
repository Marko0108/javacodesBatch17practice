package class26;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        //new ArrayList<>(); => Creating the object of the ArrayList Class
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");

        String name="James";
        Integer a=10;

        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(20);

        ArrayList<ArrayList<String>>arrayLists=new ArrayList<>();
        arrayLists.add(names);
    }
}
