package Class9;

public class E42DArrays22 {
    public static void main(String[] args) {


        int[][] numbers={
                {10, 20, 30, 40},
                {100, 200, 303,404},
                {100, 200, 303, 400}};

        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();

        }


    }
}
