import java.lang.*;

class TestExtends extends Exception { }

  

class Main {

   public static void main(String args[]) {

      try {

         throw new Test();

      }

      catch(Test t) {

         System.out.println("Got the Test Exception");

      }

      finally {

         System.out.println("Inside finally block ");

      }

  }

}

// Output is: 
// Got the Test Exception 
// Inside finally block
