package exampleJava;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Why String is Immutable (Can't change the values) and Final in Java?
 * String pool in method area?
 */
public class StringFinalAndImmutable {

	public static void main(String[] args) {
		final String s1= "java";
		String s2 ="c++";
		String s3 ="c++";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
	
		//example();
		splitEachStringsChar();
	}
	public static void splitEachStringsChar()
	{
		String result = "Stack Me 123 Heppa1 oeu";
		for(int i=0; i<result.length();i++)
		{
			System.out.println(result.charAt(i));
		}
	}
	
	public static void example()
	{ 
		String str[] ={"Java","C","C++", "Python","Java"};
		HashSet lang= new HashSet();
		boolean flag=false;
		for( String l: str) {
			if(lang.add(l)==false) {
				System.out.println("Duplicate found: " +l);
			    flag=true;
			}
		}
		 if(flag==false);
		}
		
	}
	

	     
	  
    

