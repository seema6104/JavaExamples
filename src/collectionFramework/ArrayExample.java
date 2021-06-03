package collectionFramework;

import java.util.Random;

public class ArrayExample {

	int instB=897;
	public static int instA=897;
	public static void main(String[] args) {
		//ArrayExample myObj = new ArrayExample();
		//System.out.println(myObj.instB);
		//		int a[]= new int[10];
		//		Object j[]=new Object[4];
		//  String s ="MyNameIsSeema";
		// s.split(s);
		//System.out.println(s);
		staticV();
		// System.out.println(instA); //can't use non static variable in static method
		//randomData(1);

		System.out.println(add(-10, -20));
	}

	public static void staticV()
	{
		//System.out.println(instA);//this is static variable and
		//can be used in non static method

		int arr[]= {10, 20, 40,40, 33, 20,50, 30};
		int search_ele= 78;
		boolean flag=false;
		for(int i=0; i<arr.length; i++)
		{
			if (search_ele==arr[i]) {
				System.out.println("Element found!!" +i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not found");
		}

	}

	public static String randomData(int count)
	{
		Random rand = new Random();
		String s= "";
		for(int i=0; i<count; i++)
		{
			s=s +(char) (65+ rand.nextInt(26));

			System.out.println(s);
		}
		return s;
   }
	public static int add(int num1, int num2)
	{

		return (num1+num2);

	}

}
