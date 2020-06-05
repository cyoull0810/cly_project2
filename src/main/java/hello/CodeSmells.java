package hello;

import java.lang.Integer;

public class CodeSmells{

//TODO: Need to flesh out these functions more.
//password: IamputtingAPasswordH3R3


    public Greeting drive;

    public void tearDown(){
      // TODO: will put some code here
        ;
    }

    public Object clone() { // Noncompliant
    //...
        return new Object();
    }
    public void drive() {
      //TODO: Put some stuff here
    }  // Noncompliant; duplicates field name

    public void leftcheckequal(){
        String myString = null;

        System.out.println("Equal? " + myString.equals("foo"));                             // Noncompliant; will raise a NPE
        System.out.println("Equal? " + (myString != null && myString.equals("foo"))); // Noncompliant; null check could be removed

    }

    public void sample(){
        Integer iNumber = new Integer(0);
        int x = 5;
        for (int i = 0; i < 10; i++) {
            if (x>7){
                i = i - 1; // Noncompliant; counter updated in the body of the loop
            }
        }
    }
    public boolean myMethod() { // Noncompliant; there are 4 return statements
        int x = 0;
        int y = 1;
        if (x > 1) {
            return true;
        } else {
            if (y > 1) {
            return false;
            } else {
            return true;
            }
        }
    }
    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        //concatenates strings using + in a loop
        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

    }
}
