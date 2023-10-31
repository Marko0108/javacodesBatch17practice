package review8;

public class E2InstanceVar {

    String name="jam";

    void printName(){
        System.out.println(name);
    }

    void PrintInformation(){
        System.out.println(name);
    }

    static void printInfo(){
    //    System.out.println(name);       //instance var cannot be accessed inside static var
    }

    public static void main(String[] args) {        //static var i static methods belong to class
        E2InstanceVar e1=new E2InstanceVar();
        e1.name="Jam";

        E2InstanceVar e2=new E2InstanceVar();
        e1.name="Scam";

        E2InstanceVar.printInfo();
    }
}
