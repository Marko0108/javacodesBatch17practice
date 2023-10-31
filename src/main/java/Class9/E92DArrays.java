package Class9;

import java.util.Arrays;

public class E92DArrays {
    public static void main(String[] args) {
        String[][] names =
                {       {"Hind", "Mikhail", "Ismail", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammed"},
                        {"Gui", "Backend", "Front", "API"}

                };

        for (String[] row:names){
            System.out.println(Arrays.toString(row));
        }

    }
}
