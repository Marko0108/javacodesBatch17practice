package review8;

public class E3StaticVar {
    public static final String country="USA";   //public static final everybody can access it but cannot change it

    void printName(){                           //instance var
        System.out.println(country);
    }

    static void printCountry(){
        System.out.println(country);
    }

    public static void main(String[] args) {
        System.out.println(country);
    }
}

class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3StaticVar.country);
    }

}
