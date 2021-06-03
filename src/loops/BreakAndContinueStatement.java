package loops;

public class BreakAndContinueStatement {

	public static void main(String[] args) {
		//both statement skipping 5
		//By pawan kumar
		for(int i=1;i<=10; i++)
		{
			if (i==5) 
			{
				break;
			}
			System.out.println("break: "+i);
		}
		
		for(int j=1;j<=10; j++)
		{
			if (j==5) 
			{
				continue;
			}
			System.out.println("continue: "+j);
		}
	}
	
	

}
