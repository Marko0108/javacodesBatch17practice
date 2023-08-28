package groupProjectCodingTasks;
/*
3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
 */
public class task3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {15, 17, 22, 33},
                {8, 11, 13, 24},
                {5, 9, 2, 18}
        };
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }

        }

        }
    }

