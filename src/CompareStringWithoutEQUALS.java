
public class CompareStringWithoutEQUALS 
{
	public static void main(String[] args) 
	{
	
		String s="h";
		String s1="h";
		
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				count++;
				System.out.println(s.charAt(i));
				System.out.println(s1.charAt(i));
			}
		}
		
		if((s.length())==count)
			System.out.println("true story");
		
	}
}
