package class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
        System.out.println(numbers);
        int sum=0;
        for(int n:numbers){             // for(Integer n:numbers)  Integer also works
            if(n>20){
                sum+=n; //shorthand operator or  sum=sum+n
            }

        }
        System.out.println(sum);
    }
}
