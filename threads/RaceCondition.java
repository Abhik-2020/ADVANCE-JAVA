```java
class Counter
{
    int count;

    // synchronized allows only one thread at a time
    // to execute increment() on the same Counter object.
    public synchronized void increment()
    {
        count++;
    }
}


public class RaceCondition {

    public static void main(String[] args) throws InterruptedException{

        // Both threads will share the same Counter object.
        Counter c = new Counter();


        Runnable obj1 = () ->
        {
            // Thread 1 increments count 10,000 times.
            for(int i = 1; i <= 10000; i++)
            {
                c.increment();
            }
        };


        Runnable obj2 = () ->
        {
            // Thread 2 also increments count 10,000 times.
            for(int i = 1; i <= 10000; i++)
            {
                c.increment();
            }
        };


        // Create two threads using the Runnable tasks.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        // Start both threads.
        t1.start();
        t2.start();


        // Wait for both threads to finish.
        // Without join(), main thread may print count too early.
        t1.join();
        t2.join();


        // Expected result = 10,000 + 10,000 = 20,000.
        System.out.println(c.count);
    }
}
```