package groupProjectCodingTasks;
//9. Write a java program to find the second largest
//number in the array?
public class task9 {
    public static void main(String[] args) {

        int[] numbers= {15, 17, 22, 33};
        int largest=0;
        int secondLargest=0;
        for(int num:numbers) {
            if (num > largest) {

                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest=num;
            }

        }
        System.out.println(secondLargest);
    }
}
