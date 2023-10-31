package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {

        ArrayList<Double> priceOfMakeup= new ArrayList<>();
        priceOfMakeup.add(25.5);
        priceOfMakeup.add(30.2);
        priceOfMakeup.add(25.2);

        ArrayList<Double> priceOfFruit=new ArrayList<>();
        priceOfFruit.add(2.5);
        priceOfFruit.add(3.99);
        priceOfFruit.add(4.99);

        ArrayList<Double> pricesOfDairy=new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String, ArrayList<Double>> arrayListMap=new HashMap<>();
        arrayListMap.put("pricesOfMakeup",priceOfMakeup);
        arrayListMap.put("pricesOfFruit",priceOfFruit);
        arrayListMap.put("pricesOfDairy",pricesOfDairy);
        System.out.println(arrayListMap);



    }
}
