package Class9;

public class T2DArrays {
    public static void main(String[] args) {

// write a loop to get all the elements from second row one by one

        int[][] numbers = {
                {10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[1][i]);   // first [] controls rows
            
        }

        }
    }

