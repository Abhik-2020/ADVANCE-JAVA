@FunctionalInterface 
interface A{

    // void show();
    void show(int i);
    //	void show(int i,int j);

}

public class LamdaExpretion_02 {
    public static void main(String args[]){

        // A obj = new A()
        // {
        //     public void show(int i){
        //         System.out.println("in show " + i);
        //     }
        // };

        // obj.show(1);

        // A obj = (int i) ->System.out.println("in show " + i);
        // obj.show(1);

        // A obj = (int i, int j) ->System.out.println("in show " + i +" "+ j);
        // obj.show(1,8);

        A obj = i ->System.out.println("in show " + i);
        obj.show(1);

    }

}
