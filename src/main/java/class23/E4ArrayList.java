package class23;

import java.util.ArrayList;

public class E4ArrayList {

    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList();
        arr.add("Ace");
        //arr.add(25);       error  only string objects can be stored
        arr.add("Habib");
        arr.add("Gulcan");
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Ace"));
        System.out.println(arr.contains("sdsd"));
        System.out.println(arr.indexOf("Habib"));

    }
}
