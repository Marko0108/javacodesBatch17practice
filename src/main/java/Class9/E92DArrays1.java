package Class9;

//enhanced loop
public class E92DArrays1 {
    public static void main(String[] args) {
        String[][] names =
                {{"Hind", "Mikhail", "Ismail", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammed"},
                        {"Gui", "Backend", "Front", "API"}

                };

        for (String[] row : names) {
            for (String v : row) {
                System.out.print(v +" ");
            }
            System.out.println();
          //  System.out.println(Arrays.deepToString(names)); //for printing 2d arrays
        }
    }
}
