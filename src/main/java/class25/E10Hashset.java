package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E10Hashset {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        System.out.println(numbers);
        HashSet<Integer>set=new HashSet<>(numbers);
        System.out.println(set);
//remove duplicates


    }
}