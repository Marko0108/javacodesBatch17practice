package Replit;
/*
**For you to do:**
Write a program that will print the sum of all elements in 2D array.
**Expected Output:**

-9
```
 */
public class rep82 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col <a[row].length; col++) {

                sum=sum+a[row][col];
            }

        }
        System.out.println(sum);
    }
}
