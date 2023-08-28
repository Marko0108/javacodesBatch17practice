package groupProjectCodingTasks;
/*
4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array
 */
public class task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {15, 17, 22, 33},
                {8, 11, 13, 24},
                {5, 9, 2, 18}
        };
        int sumEven=0;
        int sumOdd=0;
        for(int[] row:numbers){
            for(int num:row){
                if(num%2==0){
                    sumEven=num+sumEven;
                }else if(num%2!=0){
                    sumOdd=num+sumOdd;
                }
            }
        }
        System.out.println("Sum even numbers is "+sumEven);
        System.out.println("Sum odd numbers is "+sumOdd);
            }

        }

