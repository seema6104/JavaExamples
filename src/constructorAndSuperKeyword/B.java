package constructorAndSuperKeyword;
/* Super keyword used to call Parent class constructor
 * Super keyword always called in child class constructor only and first statements in const
 * If we dont pass anything in parent class constructor default const will
 * be called
 * only one time super keyword will be used in child class
 * If we want to run all the parents class constructor in child we have to create
 * multiple construtor in child class with super keyword
 */

public class B extends A{
  
	public B()
	{
		super();//Parent class constructor
		System.out.println("I am in Child class Constructer");
	}
	public B(int i)
	{
		super(i);//Parent class constructor
		System.out.println("Child class super const Value of i: " +i);
	}
	public B(int i, int j)
	{
		super(i, j);//Parent class constructor
		System.out.println("Child class super const Value of i: " +i + " and Value of J: " +j);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1= new B(20);
		B obj2= new B(20, 23);
	}

}
