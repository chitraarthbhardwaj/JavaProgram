
public class PalindromeCheckStringType {

	public static void main(String[] args) 
	{
	
		String ars= "madam";
		char[] ar=ars.toCharArray();
		String rev="";
		Boolean b=false;
		
		for(int i=ar.length-1;i>=0;i--)
		{
			rev=rev+ar[i];
			System.out.println("ar[]:"+ar[i]);
		}
		System.out.println(ar);
		if(rev.equals(ars))
			b=true;
		System.out.println(b);
		
		
		
		
		
		
		
		
	}

}
