
public class ReverseString {

	public static void main(String[] args) 
	{
	
		
		String st="heylostring";
		char[] ch=st.toCharArray();
		
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		
	}

}
