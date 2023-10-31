package groupProjectCodingTasks;
//8. Maximum and minimum number in the array?
public class task8 {
    public static void main(String[] args) {
        int[] numbers= {15, 17, 22, 33};

        int min=numbers[0];
        int max=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);
    }
}
