package class13;


public class E2InstanceVariables2 {

    String name ="Hind";

     void printAge() {
int age=25;
         System.out.println(age);
         System.out.println(name);

    }
    void printCountry(){

      //  System.out.println(age);   error its a local variable cant' be accessed here
        System.out.println(name);
        System.out.println(country);
    }
String country="Uganda";
}
