
public class SeeIntePalindrome {

	public static void main(String[] args) 
	{
	
		int a=454;
		int rev=0;
		int sum;
		
		int temp=a;
		while(a>0)
		{
			sum=a%10;
			rev=(rev*10)+sum;
			a=a/10;
		}
		if(temp==rev)
			System.out.println("palindrome");
		
		
		
		
		
		
	}

}
