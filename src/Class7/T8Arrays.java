package Class7;
// second way of creating arrays
public class T8Arrays {
    public static void main(String[] args) {

        // Add all the numbers from the array and print the sum at the end
        int[] numbers={20,10,50,30,40};   //150

        int sum=0;    // mora se staviti neka vrijednost npr =0 jer ne utice na konacnu vrijednost inace ce biti greska u loop

        for (int i=0; i< numbers.length; i++){
            sum=sum+numbers[i]; //pick the previous value of sum and add it to current value of array

            }
        System.out.println(sum);
        }

    }

