import java.util.ArrayList;

public class DuplicateCharactersInString {

	public static void main(String[] args) 
	{
	
		String s="Duplicates in a string";
		char[] d=new char[22];
		
		System.out.println(s.length());
		
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int k=i+1;k<=s.length()-1;k++)
			{
				if((s.charAt(i)==s.charAt(k))&& s.charAt(i)!=' ')
				{
					d[i]=s.charAt(i);
				}
		}
			System.out.println(" character which is duplicate:"+d[i]);
		}
				
		}	
		
	}

