
public class SeeIfPalindrome {

	public static void main(String[] args) 
	{
	
		String s1="Madam";
		String s=s1.toLowerCase();
		
		String rec="";
		String rev=rec.toLowerCase();
		
		Boolean b=false;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(s);
		System.out.println(rev);
			if(s.equals(rev))
			{
				b=true;
			}	
		
		System.out.println(b);
	}

}
