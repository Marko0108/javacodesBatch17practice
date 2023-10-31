package review12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E2Sets {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();       //Set without HasSet no error because implements of interface
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);        //hashset doesn't guaranty order

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        LinkedHashSet<Integer>numSet=new LinkedHashSet<>(nums);
        /*System.out.println(numSet);         //remove duplicates
        nums=new ArrayList<>(numSet);
        System.out.println(nums);

         */

        nums.clear();
        nums.addAll(numSet);
        System.out.println(nums);

    }
}
