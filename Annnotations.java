import javax.sound.sampled.SourceDataLine;

class A
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class B extends A 
{
	@Override
	// public void showTheDataWhichBelongsToThisClass()
	public void sHowTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}



public class Annnotations {
   public static void main(String[] args) 
   {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();


    }
}
