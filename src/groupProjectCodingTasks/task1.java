package groupProjectCodingTasks;
/*
1. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
public class task1 {
    public static void main(String[] args) {

        int [] temperature={52,95,77,56,45,25,88};
        int smallestTemp=temperature[0];
        for (int t:temperature){
            if (t<smallestTemp){
                smallestTemp=t;
            }
        }
        System.out.println("The lowest temperature is "+smallestTemp);

        int largestTemp=temperature[0];
        for (int t:temperature){
            if (t>largestTemp){
                largestTemp=t;
            }
        }
        System.out.println("The highest temperature is "+largestTemp);

    }
}
