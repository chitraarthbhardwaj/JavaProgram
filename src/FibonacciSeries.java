
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{	
		int m=0,n=1;
		int k;
		
		System.out.print(m+" "+n);
		for(int j=2;j<=20;j++)
		{
			k=m+n;		
			m=n;
			n=k;
			System.out.print(" "+k);
		}
			
		}
		
	}


