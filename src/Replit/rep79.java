package Replit;
/*
**For you to do:**
Write a program to print values from a 2D array
**Example Output:**
```
1.4 2.0 3.3 2.0
```
4.0 1.5 6.1 1.0
```
1.2 3.1 4.0 1.6
 */
public class rep79 {
    public static void main(String[] args) {
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
