package exampleJava;

import opreatorsJavaExample.UnaryOprators;

public class overLoading {
	static int a=0;

	public static void main(String[] args) {
		//circleparameter();
	
		//System.out.println("value is " +a);
		
		mi();

	}
	
//	public static void circleparameter() {
//		String message = "Hi there";
//		System.out.println("How are you" +message);
//		
//		
//	}
//    public void circleparameter(String r, int b) {
//		
//	}
//     public void circleparameter(long h, int j) {
//		
//	}
//     public void circleparameter(long n, int c, String p) {
// 		
// 	}
	
 	 public static void mi()
 	{
 		for (int i=0; i<=6; i++)
 		{
 			for(int j=0; j<=i; j++)
 			{
 				System.out.print(j+"*");
 			}
 			System.out.println();
 		}
 	}
	
	
	

}
