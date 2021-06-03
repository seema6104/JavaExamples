package opreatorsJavaExample;

public class UnaryOprators {

	private static void main(String[] args) {
		//Uniary oprators, this called increment oprators
		//works in loops 
		/*int i =9; // i calls oprans
          System.out.println( i++);
          System.out.println(i);
          System.out.println( ++i);
          System.out.println( i--);
          System.out.println( --i);
          for (int j = 0; j>i; j++) {
        	  System.out.println("Value is :" +i);
		
	 }
	*/
		stringMethods();
	}
	public static void stringMethods()
	{
		String str= new String("Hello");
		str.replace("e", "a");
		System.out.println(str);
          
	}

}
