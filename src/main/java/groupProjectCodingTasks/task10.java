package groupProjectCodingTasks;
//10. Write a program to print out duplicate elements from
//an Array of Strings?
public class task10 {
    public static void main(String[] args) {

            int [] arr = {5,10,5,30,8,10,6};
            String duplicateNums = "";

            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; ++j) {

                    if (arr[i] == arr[j]) {
                        duplicateNums = duplicateNums + " " + arr[i];
                    }
                }
            }

            if (!(duplicateNums.isEmpty())) {
                System.out.println("The duplicated integers are" + duplicateNums);
            }

        }

    }



