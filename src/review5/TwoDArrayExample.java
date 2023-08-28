package review5;

public class TwoDArrayExample {
    public static void main(String[] args) {

    String[][] countries={
            {"Canada", "USA"},   // index 0
            {"Ecuador", "Brazil", "Chile", "Argentina"},   // index 1
            {"Romania", "France", "Italy"}    // index 2
            };
        System.out.println(countries.length);  //3 - number of 1D arrays

        for (String[] countryArray:countries){ //outer loop iterates over 1D arrays

            for (String country:countryArray){  // inner loop iterates over each element inside that 1D array
                System.out.println(country);
            }
        }
        }
    }

