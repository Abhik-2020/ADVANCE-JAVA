interface Aditi{
    //public abstract void show();
    //public abstract void config();
    int age = 44;  // final and static 
    String area = "mumbai";

    void show();
    void config();

}
// instead of extends for inherit iterface 
//it must be declared undeclerd methods og interface it this is not a abstract class 
class B implements Aditi {

    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class IInterface{
        public static void main(String args[]){
        Aditi obj;
        obj = new B();

        obj.show();
        obj.config();

         //   	Aditi.area="Hyderabad";
         System.out.println(Aditi.area);

    }
}