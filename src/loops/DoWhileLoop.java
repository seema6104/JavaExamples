package loops;
/**
 * https://www.youtube.com/watch?v=skuBFaYgBYU
 * @author seema
 * Do wile loop: We can use this loop when we dont have to check the condition
 * We have to check in second time. 
 *For each loop: only with the array concept
 */

public class DoWhileLoop {
	

	public static void main(String[] args) {
		int i=20;
		//int i=1; //lesss than 10 will execute first time
		do {//first time will not check the condition, 
			//Directly jump to the block, than check the condition
			System.out.println(i);
			//i++;
			i+=2;  //table 
		}while(i<=10);// will not check this condition first time,  
      System.out.println("****************************************");
		oddnumAdd();
		 System.out.println("****************************************");
		printingStar();
	}
	
	public static void oddnumAdd()
	{
//		int j= 1;
//		do {
//			System.out.println(j);
//			j+=2;
//		}
//		while(j<=10);
		
		//decending order 
		for(int i=10; i>1; i--)
		{
			System.out.println("For loop decending: "+i);
			
		}
		System.out.println("********************************");
		//ascending oredr
		for(int i=1; i<=10; i++)
		{
			System.out.println("For loop ascending: "+i);
			
		}
	
	}
	
   public static void printingStar()
   {
	   int i,j,k;
	   for(i=1; i<=5; i++)
	   {
	   for(j=4; j>=i; j--)
	   {
	   System.out.print(" ");
	   }
	   for(k=1; k<=(2*i-1); k++)
	   {
	   System.out.print("*");
	   }
	   System.out.println("");
	   }
   }
}
