package Class9;

public class E42DArrays23 {
    public static void main(String[] args) {


        int[][] numbers={
                {10, 20, 30, 40},
                {100, 200, 303,404},
                {100, 200, 303, 400}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {   //numbers[row] gives us the complete 1d array
                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();

        }


    }
}
