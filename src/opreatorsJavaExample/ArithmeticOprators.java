package opreatorsJavaExample;

public class ArithmeticOprators {
	public void finalize()
	{//Java Garbage collector system.gc();
		System.out.println("Finalize Method");
	}
    
	 public static void main(String[] args) {
		 int a= 9;
		 int b = 4;
		 int res;
		
		 res= a+b + 78;
		 System.out.println("Adding using + oprators =  " +res);//String concatination "" + 
		
		 res= a-b ;
		 System.out.println("Subtract using - oprators =  " +res);
		 res= a / b ;
		 System.out.println("Deviding using / oprators =  " +res);
		// res= a * b + 48;
		 System.out.println("Multiply using * oprators =  " +a * b + 48);
		
		 res= a % b ;
		 System.out.println("Deviding using / oprators =  " +res);
		  
		 float fr = (float)a /b; //converting to the actual value trunkate type casting a nd b are int
		 System.out.println("Deviding using / oprators =  " +fr);
		
		 //numPattern();
		 stringSpace();
	}
	 
	public static void numPattern()
	{
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
			System.out.print(y+" ");
			}
		System.out.println();
		}
	}
	public static void stringSpace()
	{
		String str= "India is my company";
		System.out.println(str);
		
		System.out.println(str.replaceAll("company", "country"));
		
	}
	
	}
	 
	 
