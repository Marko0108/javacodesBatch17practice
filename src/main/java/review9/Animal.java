package review9;

public class Animal {
    void sleep(){
        System.out.println("Animals sleep");
    }
    void speak(){
        System.out.println("Animals speak");
    }
}

class Dog extends Animal{
    @Override                                   //extra checks
    void speak() {
        System.out.println("Wuff Wuff");            //override only afects object Dog
    }
}
