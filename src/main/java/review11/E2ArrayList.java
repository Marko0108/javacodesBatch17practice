package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println(numbers);

                                                            //generics  - allow us to use same class for different datatype
        ArrayList <Integer> nums = new ArrayList<>(10000);     //arraylist is class / datatype of numbers is array of integers
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);

        nums.remove(new Integer(45));
        System.out.println(nums);       //error cannot delete objects directly

        ArrayList<String> names=new ArrayList<>();
        names.add("Jamil");
        names.add("Artur");
        names.remove("Artur");
        System.out.println(names);
    }
}
