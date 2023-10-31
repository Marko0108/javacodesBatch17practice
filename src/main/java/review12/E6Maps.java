package review12;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {

        Map<String, Double> studentMarksMap=new HashMap<>();
        studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Madina",95.5);
        studentMarksMap.put("Arthur",89.5);
        studentMarksMap.put("Nelson",97.5);

        studentMarksMap.replaceAll((k,v)->{

                return 0.0;

        });
        System.out.println(studentMarksMap);



    }
}
