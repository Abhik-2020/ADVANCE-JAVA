interface Aditi{
    //public abstract void show();
    //public abstract void config();
    int age = 44;
    String area = "mumbai";

    void show();
    void config();

}

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

         //   	A.area="Hyderabad";
         System.out.println(Aditi.area);

    }
}