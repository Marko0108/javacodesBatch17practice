package Class9;

//Create 2D array of cars:american, german, korean, italian. Then retrieve all values from that array using 2 different loops
public class T3DArrays {
    public static void main(String[] args) {

                String [][] cars={
                        {"Jeep", "Ford", "Cadillac", "Dodge"},
                        {"Audi", "BMW", "Porsche", "Volkswagen"},
                        {"kia", "Hyundai", "Genesis", "Pronto"},
                        {"Lamborghini", "Ferrari", "Maserati", "Alfa"},
                };
                for (String[] r:cars){
                    for (String c:r){
                        System.out.print(c+" ");
                    }
                    System.out.println();
                }
        };

    }


