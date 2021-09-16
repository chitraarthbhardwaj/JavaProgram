
public class ReverseStringProgrammByWords 
{

	public static void main(String[] args) 
	{
	
		String s1="hello kitty there you are";
		
		String[] ss=s1.split("\\s+");
		
		for(int i=ss.length-1;i>=0;i--)
		{
			System.out.print(ss[i]+" ");
		}
		
	}

}
