package Class9;

public class T2DArrays1 {
    public static void main(String[] args) {
        String[][] students = {
                {"Aysha", "Giulia", "John", "Deepali"},
                {"A", "A+", "C", "B"}
        };

        for (int i = 0; i < 4; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]);    // ako stavim 0 umjesto 1 dobijam studente pa se pravi if

            }

        }
    }
}

