package class8;

public class TaskArrays {
    public static void main(String[] args) {
// Count how many numers are greater than 10 in below array
        //expected answer 3

        int[] numbers={10,20,4,3,8,45,96};
        int count=0;
        for ( int i=0; i < numbers.length; i++){
            if (numbers[i]>10){
                count++;
            }
        }
        System.out.println(count);

        }
        }


