package review9;

public class Parent {
    String name="James";            // when we remove this string error on super

    void printHello(){
        System.out.println("Hello World");
    }
    Parent(){
        System.out.println("Parent class constructor");
    }

    Parent(String n){
        System.out.println("Parent class with parameter");
    }
}
class Child extends Parent {
    String name="John";
    void printHello(){
        System.out.println("Hello Java");
    }
    void test(){
        String name="White";
        System.out.println(super.name);       //when put super java goes to parent class
        System.out.println(name);               //both names java uses default preference - local first, instance than instance from parent class
        System.out.println(this.name);          // calling instance variable
    }
    void methodTest(){
        super.printHello();           //super everything from parent class  "Hello world"
    }                                   //to call something from parent class specifically
    public  Child(){
super();
    }
}