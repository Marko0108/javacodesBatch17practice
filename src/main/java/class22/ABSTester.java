package class22;

public abstract class ABSTester {
    int age;
    ABSTester(){

    }

  private void  Batch17YouShouldStartStudying(){
      System.out.println("Its posible");        //private method inside abstract class
  }

    public void anotherM(){
        Batch17YouShouldStartStudying();
    }

  static void abc(){

  }
}

interface A {
    // int age;  error
    private void tester() {                                               //private method inside inteface
    }

    static void abc(){

    }
}

class Tester{
    public static void main(String[] args) {
      //  ABSTester a=newABSTester();    error
      //  A a=new A();      error    cannot create object of interface
    }
}