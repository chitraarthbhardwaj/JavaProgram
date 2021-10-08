
public class PalindromCheckInteger {

	public static void main(String[] args) 
	{
	
		int[] a= {'1','2','1'};
		int[] b= {};
		Boolean k=false;
		
		for(int i=a.length-1;i>=0;i--)
		{
			b=a;
		}
		if(b.equals(a))
			k=true;
		System.out.println(k);
	
	}

}
