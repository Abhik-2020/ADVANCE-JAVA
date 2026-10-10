public class ExceptionCustom_07 {
    public static void main(String[] args) {
        int i = 20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new Exception("/i dont want to do print zero");
            }
        }
        catch(ArithmeticException e){
            j=18/i;
            System.out.println("that the default output" + e);

        }
    }


    
}
