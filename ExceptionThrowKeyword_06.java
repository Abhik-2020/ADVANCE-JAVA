
public class ExceptionThrowKeyword_06 {
    public static void main(String[] args) {

        int i = 20;
        // int i = 0; // Uncomment this to test division by zero

        int j = 0;

        try {
            // Divide 18 by i and store the result in j
            j = 18 / i;

            // If the result is zero, manually throw an exception
            if (j == 0) {
                throw new ArithmeticException(
                    "I don't want to print zero"
                );
            }
        }

        // Handles ArithmeticException thrown in the try block
        catch (ArithmeticException e) {

            // Assign a default value by dividing 18 by 1
            j = 18 / 1;

            // Print the default output and exception message
            System.out.println("That is default output" + " " + e);
        }

        // Handles other exceptions not caught by the above catch
        catch (Exception e) {
            System.out.println("Something went wrong." + " " + e);
        }

        // Print the final value of j
        System.out.println(j);

        // This statement executes after exception handling
        System.out.println("Bye");
    }
}
