
 // Creating a custom checked exception by extending Exception
class NavinException extends Exception {

    // Constructor of the custom exception
    public NavinException(String string) {

        // Passes the error message to the parent Exception class
        super(string);
    }
}

public class CustomException {

    public static void main(String[] args) {

        // int i = 2;
        // int i = 0;
        int i = 20;  // Value used as the divisor

        int j = 0;   // Variable to store the result

        try {
            // Divide 18 by i and store the result in j
            j = 18 / i;

            // If the result is zero, throw our custom exception
            if (j == 0) {
                // Creates and throws a custom exception
                throw new NavinException(
                    "I don't want to do print zero"
                );
            }
        }

        // Handles arithmetic errors, such as division by zero
        catch (ArithmeticException e) {

            // This statement would also throw an exception
            // if i were 0, because 18 / 0 is invalid
            j = 18 / i;

            // Prints the arithmetic exception details
            System.out.println("that is default output" + e);
        }

        // Handles other exceptions, including NavinException
        catch (Exception e) {

            // Prints a message and the exception details
            System.out.println("Something went wrong." + e);
        }

        // Prints the final value of j
        System.out.println(j);

        // Prints Bye after exception handling finishes
        System.out.println("Bye");
    }
}
