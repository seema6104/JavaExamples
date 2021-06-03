package finlizeMethodWithGarbageCollector;
/*  https://www.youtube.com/watch?v=aqDiBybBRqM  by Naveen 
 * Garbage collector is used just to clean up process of the object
 * what is the difference between finally, finalize and final: finally is a block, final is keyword and
 * Finalize is a method keywords in java
 * Finalize is a clean up process before the garbage collector process
 */
public class FinalizeAndGarbageCollector {
	public void finalize()
	{
		System.out.println("Finalize");
	}

	public static void main(String[] args) {
		
		FinalizeAndGarbageCollector f1= new FinalizeAndGarbageCollector();
		FinalizeAndGarbageCollector f2= new FinalizeAndGarbageCollector();
		f1=null;
		f2=null;
		System.gc();
		

	}
}
