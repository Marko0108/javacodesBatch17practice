package Replit;
/*
Write a program that sums all numbers that are on even index and on even row.
**Expected Output:**
```
-4
 */
public class rep85 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int sum=0;
        int sumRow;
        for (int row = 0; row< a.length; row+=2) {

            for (int col = 0; col < a[row].length; col+=2) {
                sum=sum+a[row][col];


            }
        }  System.out.println(sum);
    }
}
