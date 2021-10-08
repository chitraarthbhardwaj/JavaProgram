
public class CompareStrings {

	public static void main(String[] args) 
	{
	
		String a1="Test string 1";
		String b1="Test string 2";
	
		
		if(a1.equals(b1))
		{
			System.out.println("same");
		}
		else
			System.out.println("nope");
		System.out.println(a1);
		System.out.println(b1);
		
		
		
		char[] a=a1.toCharArray();
		char[] b=b1.toCharArray();
		
		/*System.out.println(a.length);
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<b.length;k++)
			{
				 if(a[i]==b[k]) 
				 {
					 count++;
					 System.out.println(count); 
				 }	
			}
		}
		if(count==a.length)
		{
			System.out.println("same");
		}	
	}*/
}
}