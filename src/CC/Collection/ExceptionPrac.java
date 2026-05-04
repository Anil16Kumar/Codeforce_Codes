package CC.Collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionPrac {

    public static void readFile() throws IOException {
        // file reading logic
    }

    public static void checkAgeMethod(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
        System.out.println("Eligible");
    }
    public static void readFilemethod() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void validate(int num) throws Exception {
        if (num < 0) {
            // explicitly throwing exception
            throw new Exception("Number cannot be negative");
        }
        System.out.println("Valid number");
    }

    public static void main(String[] args) throws IOException {
        //throw vs throws vs Throwable

        /*
        * | Feature              | `throw`                                   | `throws`                                          |
          | -------------------- | ----------------------------------------- | ------------------------------------------------- |
          | Meaning              | Used to **explicitly throw an exception** | Used to **declare exception in method signature** |
          | Used in              | Method body                               | Method declaration                                |
          | Number of exceptions | One at a time                             | Multiple exceptions                               |
          | Purpose              | Actually throw exception                  | Inform caller that exception may occur            |

        * */

        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age < 18) {
            throw new IllegalArgumentException("Age must be 18+"); //we are manually throwing an exception
        }

        readFile();// This method may throw IOException, caller should handle it

        //👉 throw = Do it now
        //👉 throws = Tell others it may happen

        //Throwable is the parent class of all errors and exceptions in Java
        /*
Throwable
   |
   |---- Exception
   |        |
   |        |---- Checked Exception
   |        |---- RuntimeException
   |
   |---- Error
   */
        //throw is used to explicitly throw an exception inside a method,
        // whereas throws is used in method declaration to indicate that the method may throw exceptions and the caller must handle them.

        checkAgeMethod(15);// throw uses
        //Age = 15
        //Condition fails
        //throw is executed
        //Program stops with exception

        //error message:
        //Exception in thread "main" java.lang.IllegalArgumentException: Age must be 18+
        //Here we used throw to explicitly throw an exception when business condition fails.
        //----------

        try {
            readFilemethod();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        //readFilemethod() may throw IOException
        //So we declare it using throws
        //Caller (main) handles it using try-catch

        //throws is used to inform the caller that this method can throw an exception, so it must be handled.

        //---------------------------
        //combine example
        try {
            validate(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Flow
        //main() calls validate()
        //validate() detects invalid input
        //throw creates exception
        //throws passes responsibility to caller
        //main() catches it

        //output:
        //Number cannot be negative

        // inside a method, we use throw to explicitly create an exception when a condition fails.
        // The method declares throws to inform the caller that it may throw an exception. The caller then handles it using try-catch.

        //Is it compulsory to use catch with throws?
        /*
        *
        | Type                | Catch Required?   |
        | ------------------- | ----------------- |
        | Checked Exception   | ✅ Yes (or throws) |
        | Unchecked Exception | ❌ No              |

        No, catch is not compulsory if we use throws. For checked exceptions,
        we must either handle them using try-catch or declare them using throws. For unchecked exceptions, neither is mandatory.

        * */

    }
}
