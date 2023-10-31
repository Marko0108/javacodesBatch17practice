package review10;

public interface Human {            //interface is by default abstract
  //  private int age;             //Can we have private variables in a interface? No   error

    public static final int MAX_AVG_AGE=100;            // by default all var are public
    String name="John";                             //by default all var are public (instance var are not allowed)

    /*
    public Human(){                         // constractors are not allowed
    }
     */
    /*
    public void eat(){          //intercafe abstract cannot have a body error
    }
    */
     //private void eat();         // error

    //final void eat();             //final is complete  error
}
