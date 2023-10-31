package class13;

public class E3LocalDemo {

    //int sum=0;     if we put here instead inside more memory used

    void addElements(){
        int[] arr={10,20,30};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
        sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
