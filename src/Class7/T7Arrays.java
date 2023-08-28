package Class7;
// second way of creating arrays
public class T7Arrays {
    public static void main(String[] args) {



        int[] numbers={20,29,48,69,60};   // print only even numbers 20 48 60

        for (int i=0; i< numbers.length; i++){   //or i=i+2 without if
            if (numbers[i]%2==0) {
                System.out.println(numbers[i]);
            }
        }

    }
}
