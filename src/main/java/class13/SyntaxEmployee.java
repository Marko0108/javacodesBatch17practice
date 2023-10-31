package class13;

public class SyntaxEmployee {
    String emplID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.emplID="I123";
        asghar.salary=20;

        SyntaxEmployee moazzam=new SyntaxEmployee();
        moazzam.emplID="I456";
        moazzam.salary=95;

        System.out.println(moazzam.salary);
        System.out.println(moazzam.emplID);
        System.out.println(asghar.salary);
        System.out.println(asghar.emplID);

    }

}
