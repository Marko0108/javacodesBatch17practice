package class21;

public abstract class Animal {

    abstract void speak();          //method is not complete, doesn't have a body
    abstract void sleep();
    abstract void eat();

   //abstract String getString(String a, int b);
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff Wuff...");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours.....");
    }

    @Override
    void eat() {
        System.out.println("Eating bones.....");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow....");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }

    @Override
    void eat() {
        System.out.println("Sleeping for last 10 hours.....");
    }
}
