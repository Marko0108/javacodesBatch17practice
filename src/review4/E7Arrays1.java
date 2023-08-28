package review4;

public class E7Arrays1 {
    public static void main(String[] args) {

        int[] salaries={120000,150000,200000};  // index 0,1,2
        System.out.println(salaries[1]);        // [3]  error


        salaries[1]=160000;                         //updating the value at index1
        System.out.println(salaries[1]);

/*
        salaries[3]=145000;                     //out of bound error
        System.out.println(salaries[3]);

 */


    }
}
