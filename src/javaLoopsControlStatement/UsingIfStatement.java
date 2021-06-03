package javaLoopsControlStatement;

public class UsingIfStatement {

	public static void main(String[] args) {
		//simpleIF();
		//ifElseLadder();
		//nestedIf();
		demo();

	}
	public static void simpleIF()
	{
		int n =9;
		if(n%2==0)
		{
			System.out.println("Its an even number");
		}
		else {
			System.out.println("Number is odd ");
		}
	}
	public static void ifElseLadder()
	{
		int n = 9;
		if(n < 10)
		{
			System.out.println("Number is greater than 10");
		}
		else if(n <= 10)
		{
			System.out.println("Number is less than 10");
		}
		else if(n==0)
		{
			System.out.println("Number is equal to 0");
		}
		else if (n !=10)
		{
			System.out.println("Number is not equal to 0");
		}
	
	}
	public static void nestedIf()
	{
		int n=20;
		if(n < 10)
		{
			System.out.println("n is greater than 20 10");
		if (n >30) {
			System.out.println("n is greater than 30");
		}
		else{
			System.out.println("not greater than 20");
		}
		}
		
	}
	public static void demo()
	{
		String str= "Testing";
		StringBuffer sb= new StringBuffer(String.valueOf(str));
		System.out.println(sb.reverse());
		
	}
	

}
