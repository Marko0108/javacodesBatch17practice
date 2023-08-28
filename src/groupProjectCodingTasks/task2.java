package groupProjectCodingTasks;
/*
2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.

 */
public class task2 {
    public static void main(String[] args) {

        int [] temperature={52,95,77,56,45,25,88};

int sum=0;
for (int t:temperature){
    sum=sum+t;
}
        System.out.println("Sum of all stored elements is "+sum);
    }
}
