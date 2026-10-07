// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface Father{
    //	public abstract void show();
    //	public abstract void config(); 

    int age = 51;
    String area = "mumbai";

    void show();
    void config();
}

interface Mother{
    void run();
}

interface Aditi extends Mother{

}
// Abhik is a class 
class Abhik implements Father, Aditi{

    public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
	public void run()
	{
		System.out.println("running...");
	}

}


public class MoreOnInterface{
    public static void main(String[] args) {

        Father obj;
        obj = new Abhik();
        obj.show();
        obj.config();

        Mother obj1;
        obj1 = new Abhik();
        obj1.run();

        // Aditi obj2;
        // obj2 = new Abhik();
        // obj2.show(); //error

        // Father.age = 60;       // ERROR
        // Father.area = "Delhi"; // ERROR
        // You cannot change age and area directly in your current code because variables declared inside an interface are automatically:
        // public static final
        // So this:
        // int age = 51;
        // String area = "mumbai";
        // is actually:
        // public static final int age = 51;
        // public static final String area = "mumbai";

         
        System.out.println(obj.age);
        System.out.println(Father.age);






        
    }

}