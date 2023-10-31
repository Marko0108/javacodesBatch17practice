package review10;

public abstract class Animal {
    abstract void speak();
    abstract void eat();

}

class Dog extends Animal{           //ctrl+o
    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{               //ctrl+o
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to Eat free Fish from Giulia");
    }
}
