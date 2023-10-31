package class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {
//print all even numbers one by one from this array using enchanced for loop


        int [] nums={10,23,25,56,60,20};
//find the largest even number
        int largest=nums[0];
        for (int d:nums){

        if (d>largest&&d%2==0){
                largest=d;
            }
        }
        System.out.println(largest);
    }
}
