package class10;
// no main
public class Student {
    //Properties/Attributes                design
    String name;
    int age;
    String  id;
    // Methods/functions/behaviours
    void study(){                                       // void means behavior
        System.out.println("Studying 16 hours a day.........");
    }

    public static void main(String[] args) {
        Student ehabObj=new Student();                 // we are creating an actual student by using the Student class
        ehabObj.name="Ehab";
        ehabObj.age=22;
        ehabObj.id="abc123";
        ehabObj.study();            //scanner.nextInt();

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="add123";
        habibObj.study();

            }
}
