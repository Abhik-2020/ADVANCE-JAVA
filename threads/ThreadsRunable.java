// class Z
// {
	
// }
// class A exdends z, Threads
// class A implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hi");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class B implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hello");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }



public class ThreadsRunable {
    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();
        // you can also write as 
        // Runnable obj1 = new A();

		// Instead of creating separate classes A and B,
        // we can use a lambda expression because Runnable has only one method: run().

		Runnable obj1 = () ->
			{
				for(int i=1;i<=5;i++){

					System.out.println("Hi");

					
					try {
						// Pauses the current thread for 10 milliseconds.
						Thread.sleep(10);
					}
					catch(InterruptedException e) {
						// Handles interruption while the thread is sleeping.
						e.printStackTrace();
					}
			
			
				}
			};

   	    // Runnable obj2 = new B();
		Runnable obj2 = () ->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello");
					try {
						// Pauses the current thread for 10 milliseconds.
						Thread.sleep(10);
					}
					catch(InterruptedException e) {
						// Handles interruption while the thread is sleeping.
						e.printStackTrace();
					}
				}
			};


			// obj1.start(); //shows Error
			// obj2.start();

			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
				
			t1.start();
			t2.start();
    
    	}
    
}
