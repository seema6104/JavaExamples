package exampleJava;
public class ConstructorConcepts {
       String name;
       int age;
       //no return value
       //Can we overload constructor yes
	public ConstructorConcepts()// 0 param
	{
		System.out.println("Default constructor");
	}
	public ConstructorConcepts(int i)// 1 param
	{
		System.out.println("1 param const");
		System.out.println(i);
	}
	public ConstructorConcepts(int i, int j)// 2 param 
	{
		System.out.println("2 param constructor");
		System.out.println(i+ " " + j);
	}
	
	public static void main(String[] args)
	{  // constructor will call after creating the object
		//new ConstructorConcepts(); after this line constructor will call
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj2 = new ConstructorConcepts(10, 20);
	}

}
