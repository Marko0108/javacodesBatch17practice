package class8;

public class T4EnhancedLoop1 {
    public static void main(String[] args) {
//find the largest number negative numbers

        int [] nums={-10,-23,-25,-56,-45,-20};

        int largest=nums[2];   //broj je nebitan
        for (int n:nums){

            if (n>largest){
                largest=n;
            }

        }
        System.out.println(largest);
    }
}
