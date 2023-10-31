package class25;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
 Then remove any city that starts with “A”;
 */
public class T4Sets {
    public static void main(String[] args) {
        LinkedHashSet <String> cities= new LinkedHashSet<>();
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Vancouver");
        cities.add("Amsterdam");
        cities.add("Calgary");
        cities.add("California");
        cities.add("Berlin");
        cities.add("Aurora");
        cities.add("Ankara");
        cities.add("Alexandria");
        System.out.println(cities);


        cities.removeIf(x->x.toLowerCase().startsWith("a"));
        System.out.println(cities);
    }
}
