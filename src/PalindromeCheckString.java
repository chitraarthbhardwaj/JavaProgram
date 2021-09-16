
public class PalindromeCheckString {

	public static void main(String[] args) 
	{
	
		String ars="madam";
		char[] ar=ars.toCharArray();
		Boolean b=false;
		
		String rev="";
		
		for(int i=ar.length-1;i>=0;i--)
		{
			rev= rev+ar[i];
		}
		if(rev.equals(ars))
			b=true;
		System.out.println(b);
		System.out.println(ars);
		System.out.println(rev);
	
	
	
	
	
	
	}

}
