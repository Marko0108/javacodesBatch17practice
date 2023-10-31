package class20;

public class Student {
    private String name;                        //instance variable
    private String id;

    public Student(String name, String id) {   //local variables
        this.name = name;
        this.id = id;
    }

    public void printInfo() {
        System.out.println(name + " " + id);
    }
}
