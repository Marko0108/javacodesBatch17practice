package Replit;
/*
Write a program that prints the total number of elements that are negative AND odd
**Output:**
for example -3 is both negative and odd
```
3
 */
public class rep84 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int count=0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col <a [row].length; col++) {
                if (a[row][col] % 2!=0 &&a[row][col] <0) {
                    count++;

                }
            }

        }System.out.println(count);
    }
}
