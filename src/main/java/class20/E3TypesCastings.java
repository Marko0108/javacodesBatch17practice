package class20;

public class E3TypesCastings {
    public static void main(String[] args) {



        Student s1=new Student("Aslan","A123");             //s1 object of the class   Student is datatype
        Student s2=new Student("Mikhail","12345");

        Student[] arr={new Student("Aslan","A123"),new Student("Mikhail","12345")};

        //arr[1].printInfo();           arr[1] index number 1

        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            s.printInfo();
        }


        int num=(int)12.5;
        System.out.println(num);
        double age=10;

        Animal a= new Dog();
        Dog d=(Dog)new Animal();


//every class is treated like datatype   Student datatype

    }
    }

