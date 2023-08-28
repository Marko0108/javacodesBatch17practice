package class5;

public class E6OROperator {

    public static void main(String[] args) {

        String genre="thriller";
        if (genre.equals("thriller")||genre.equals("horror")||genre.equals("sc fi")){
            System.out.println("I am going to watch this movie");
        }else {
            System.out.println("I dont like this genre");
        }
    }
}

