package review8;

public class E1LocalVariables {
    public static void main(String[] args) {

        {
            int age=10;             //block of code
        }
        if (10>5){
            String name="Wanda";
        }
      //  System.out.println(name); error  outside block of code
     //   System.out.println(age);  error  outside block of code
    }
}
