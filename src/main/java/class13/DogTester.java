package class13;

public class DogTester {
    public static void main(String[] args) {
                                    // must use instance no local
        Dog d1=new Dog();
        d1.name="Picho";
        d1.bread="Persian";
        d1.age=36;

        Dog d2=new Dog();
        d2.name="Papi";
        d2.bread="German";
        d2.age=21;
        d1.printInfo();
        d2.printInfo();
    }
}
