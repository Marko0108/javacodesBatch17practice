package class26;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {

        /*
        Integer a=10;       // error no autotype casting nonprimitive
        Double b=a;

        int a=10;
        double b=a;         // java autotype casting primitive

        Double d=8.5;       parent child works only - no error
        Number n=d;
        */

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);                    //for the keys cannot have duplicate but for values is ok
        fruit.put("Orange",5.2);
        fruit.put("Kiwi",4.0);
        fruit.put("Apple",8.0);                 // if we put ("Apple",4.0) overrides previous apple // no order with hash

        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.containsValue(44));
        System.out.println(fruit.isEmpty());

    }
}
