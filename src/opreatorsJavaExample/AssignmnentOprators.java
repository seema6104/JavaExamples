package opreatorsJavaExample;

public class AssignmnentOprators {

	public static void main(String[] args) {
		//+ operator to add together two values
		int a =20;
		int b =25;
		int res =0;
		res =a+=10; //a=a+10
		System.out.println(res);
		
		res =a+=b; 
		System.out.println(res);
		
		res =a-=10; 
		System.out.println(res);
		
		res =a-=b; 
		System.out.println(res);
		
		res = a*=10; 
		System.out.println(res);
		
		res = a*=b; 
		System.out.println(res);
		
		//For division do type casting float for result 
		res = a /=10; 
		System.out.println(res);
		
		res =a-=b; 
		System.out.println(res);
		
		//Converting int to double using type casting
		//int has smaller data type
		
		int myInt = 0;
		double mydo= 78.567d;
		//Smaller to bigger is casting
		// We can loose data when converting
		myInt= (int) mydo;
		System.out.println("Decimal :" + mydo);
		//Decimal value will truncate after the casting
		System.out.println("After casting: " + myInt);

	}

}
