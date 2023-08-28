package Class9;

public class E12DArrays {
    public static void main(String[] args) {
        String[][] names =
                {       {"Hind", "Mikhail", "Ismail", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammed"},
                        {"Gui", "Backend", "Front", "API"}

                };
        System.out.println(names[2][2]);    //John Ahmed
        System.out.println(names[1][3]);    //Tamim

    }
}
