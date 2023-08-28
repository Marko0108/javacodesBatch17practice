package class10;

public class CarTester {
    public static void main(String[] args) {
        Car bmwObj=new Car();
        bmwObj.make="BMW";
        bmwObj.model="I7";
        bmwObj.price=100000;
        bmwObj.moveForward();
        bmwObj.applyBrakes();

    }
}
