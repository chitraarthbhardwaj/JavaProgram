
public class FindSubstring {

	public static void main(String[] args) 
	{
	
		String s="Theverymainstring";
		String s1="mmmain";
		int count=0;
		
		if(s1.length()<=s.length())
		{
			//System.out.println("here 1 if");
			for(int i=0;i<=s1.length()-1;i++)
			{
				//System.out.println("here 1 for");
				for(int k=0;k<=s.length()-1;k++)
				{
					//System.out.println("in 2 for");
					
					if(s1.charAt(i)==s.charAt(k))
					{
						if(s1.lastIndexOf(s1.charAt(i))==s1.indexOf(s1.charAt(i)))
						{
							//if(s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i)))
							//{
								count++;
								System.out.println("s1.charAt: "+s1.charAt(i));
				//			}	
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(s1.length());
		if(count==s1.length())
			System.out.println("yes");
		
	}

}
}
