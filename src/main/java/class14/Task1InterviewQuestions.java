package class14;
/*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
Method should be visibly only within same package and accessible by creating an instance/object of the class.
 */
public class Task1InterviewQuestions {
    public static void main(String[] args) {
        Task1InterviewQuestions t2=new Task1InterviewQuestions();
        int[] array={10,25,15};
        System.out.println(t2.getArrSum(array));
    }
    int getArrSum(int []arr){
        int sum=0;
        for (int n:arr) {
            sum=sum+n;

        }
        return sum;
    }

}
