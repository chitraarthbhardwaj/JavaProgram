
public class PrintRhombusPattern {

	public static void main(String[] args) 
	{
	
		
		for(int i=0;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				
				System.out.print("*");
			}
			for(int m=0;m<=7;m++)
			{
				System.out.print("*");
			}
			for(int n=7;n>=i;n--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
	}

}
