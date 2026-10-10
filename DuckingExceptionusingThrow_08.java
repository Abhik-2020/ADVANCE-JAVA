
class A
{
    // 'throws' declares that this method may pass
    // ClassNotFoundException to the calling method.
    public void show() throws ClassNotFoundException
    {
        /*
        // Alternative approach: handle the exception inside this method.
        try
        {
            Class.forName("Calc");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find the class");
        }
        */

        // Loads the class named "Calc" at runtime.
        // If the class is not found, Java throws ClassNotFoundException.
        Class.forName("Calc");
    }
}

public class DuckingExceptionusingThrow_08
{
    // Static block executes when this class is initialized,
    // before the main() method starts.
    static
    {
        System.out.println("Class Loader");
    }

    public static void main(String[] args)
    {
        /*
        // Another way to load a class and handle the exception.
        try
        {
            Class.forName("Class");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find the class");
        }
        */

        // Creates an object of class A.
        A obj = new A();

        // The show() method declares ClassNotFoundException
        // using 'throws', so the caller must handle or declare it.
        try
        {
            // Calls show(), which attempts to load the Calc class.
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            // Prints the exception details and stack trace.
            e.printStackTrace();
        }
    }
}
