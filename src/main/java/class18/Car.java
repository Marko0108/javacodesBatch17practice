package class18;

public class Car {
    private String make;                //parent class
    private String model;
    private double price;
    private String color;     // private -  cannot access in child class only calling super

    public Car(String make, String model, double price, String color) {
        this.make = make;
        this.model = model;
        this.price = price;                             //constructor
        this.color = color;
    }

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;

    }

    void printInfo() {                                                                  //method
        System.out.println(make + " " + model + " " + price + " " + color);

    }
}

class BMW extends Car {

    public BMW(String make, String model, double price, String color) {
        super(make, model, price,color);                         //super - Calling the constructor from the parent class
                                                                 // to initilaze instance fields from parent class
    }                                                        //child class using constructor from the parent class
}                       //"this()" called constructor from the same class - reuse same constructor //"super" from parent

class Audi extends Car {
    boolean sunRoof;

    public Audi(String make, String model, double price, String color){

        super(make, model, price);
        this.sunRoof=sunRoof;
    }

}









