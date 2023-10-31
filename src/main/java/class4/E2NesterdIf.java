package class4;

public class E2NesterdIf {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColor = "Black";

        if (winter == true) {
            System.out.println("Its Very cold");

            if (jacketColor.equals("Red")) {
                System.out.println("Lets go with Red Nike shoes");
            }else {
                System.out.println("Lets go with te blue ones");
            }

        } else {
            System.out.println("No need to wear jackets");

        }
    }
}
