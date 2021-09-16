
public class RightStar {

	public static void main(String[] args) 
	{
		//OUTER LOOP FOR COLUMNS COUNT, INNER FOR LOOP FOR ROWS COUNT
	
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=5;m>=0;m--)
		{
			for(int n=0;n<=m;n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
