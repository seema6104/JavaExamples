package opreatorsJavaExample;

public class RelationalAndLogicalOprators {

	public static void main(String[] args) {
		
		int a= 6;
		int b = 9;
		boolean res= false;
		
		//Relational oprators
		res= a>b;
		System.out.println("a > b : " +res);
		
		res= a<b;
		System.out.println("a < b : " +res);
		
		res= a==b;
		System.out.println("a == b : " +res);
		
		res= a!= b;
		System.out.println("a != b : " +res);

		res= a>=b;
		System.out.println("a >= b : " +res);
		
		res= a <=b;
		System.out.println("a <= b : " +res);
		
		//Logical oprators
		res= (a <=b) && (a==b);
		System.out.println("(a <=b) && (a==b) : " +res);
		
		
		//And logical Oprators
		res= (a <=b) && (a==b);
		System.out.println("(a <=b) && (a==b) : " +res);
		//or logical Oprators
		res= (a > b) || (a==b);
		System.out.println(" a > b) || (a==b) : " +res);
		
		
		res= (a > b) || (a==b) && (a==b) ;
		System.out.println("(a > b) || (a==b) && (a==b) : " +res);
		
		
	}

}
