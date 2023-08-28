package groupProjectCodingTasks;
/*
5. Write a program to swap 2 numbers without a
temporary variable?

 */
public class task5 {
    public static void main(String[] args) {
        int x=7;
        int y=8;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print(x);
        System.out.print(y);
    }
}
