package class8;

public class Task6EnhancedLoop {
    public static void main(String[] args) {

//find the smallest number
        int [] nums={10,77,25,56,60,20, -10, -5};

        int smallest=nums[0];

        for (int n:nums){
            if (n<smallest){
                smallest=n;
            }
        }
        System.out.println(smallest);



    }
}
