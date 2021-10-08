
public class ReverseWordsString {

	public static void main(String[] args) 
	{
	
		String ar="kitty is here and jumping";
		
		String[] s=ar.split("\\s+");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
		
		
		
		
		
		
	}

}
