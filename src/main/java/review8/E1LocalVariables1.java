package review8;

public class E1LocalVariables1 {
    public static void main(String[] args) {

       // System.out.println(country);    error   top to bottom
        String country="Uganda";
        {
            int age=10;             //block of code
            System.out.println(country);

        }
        if (10>5){
            System.out.println(country);
            String name="Wanda";
        }System.out.println(country);
      //  System.out.println(name); error  outside block of code
     //   System.out.println(age);  error  outside block of code
    }
}
