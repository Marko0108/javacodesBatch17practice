package class18;

class GrandPa{                                              //naknadno ubaceno - ide od local prema gore ako nema neke
    String color="White";                                   //od variable
}
public class Furniture extends GrandPa{
    String color="Black";                           //parent variable
}

class Chair extends Furniture{
    String color="Brown";                           //instance variable
    void printColor(){
        String color="Blue";
        System.out.println(color);              // local variable
        System.out.println(this.color);         //instance variable
        System.out.println(super.color);  //called "Black" from parent class

    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
