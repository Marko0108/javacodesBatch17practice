package review4;

public class E5NestedLoop1 {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *
                           first 4 rows
         */

        for (int i = 1; i <= 4; i++) {      //outer loop
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

