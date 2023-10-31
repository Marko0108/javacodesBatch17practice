package Class7;
/*
1 2 4 5 6
1 2 4 5 6
1 2 4 5 6
1 2 4 5 6
 */
public class T2NestedLoops1 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 4) {
            int j = 1;
            while (j < 7) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
                j++;
            }
                System.out.println();
                i++;
            }

        }
    }

