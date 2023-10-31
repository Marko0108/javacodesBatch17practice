package class22;

public interface MoveAble {

    // int age    error no instance fields so no constructor allowed
    //  void est(){} error  method with body

     void move();

}
interface WashAble {
    void wash();


}

class Dog implements MoveAble, WashAble {           //multiple inheritance only with classes with interface

    public void move() {
        System.out.println("Dogs can jump run and can move");
    }


    @Override
    public void wash() {
        System.out.println("You can safely wash a Dog");
    }
}

class Car implements MoveAble, WashAble {
    @Override
    public void move() {
        System.out.println("Car can move forward backwards and can go in circles ");
    }

    @Override
    public void wash() {
        System.out.println("We can wash a car");
    }
}