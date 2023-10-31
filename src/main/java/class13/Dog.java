package class13;

public class Dog {
    String name;
    String bread;
    int age;

    void printInfo(){
        System.out.println(name+" "+bread+" "+age);
    }
    void printName(){
        System.out.println(name);
    }
    void changeName(String dogName){
        name=dogName;
    }
}
