public class SplitFromSecondInstance
{

	public static void main(String[] args) 
	{
	
		String aa="The is string which is second";
		String[] rest=aa.split("is", 3);
		for(int e=0;e<=rest.length-1;e++)
		{
			System.out.println(rest[e]);
		}/*
		 char[] a=aa.toCharArray();
		 String b="";
		
		  
		 * for(int i=0;i<=a.length-1;i++) { if((a[i]==4)||(i==5)) { a[i]='d'; }
		 * if(a[i]==(' ')) { a[i]='|'; } System.out.print(a[i]); }
		 		
		
		for(int i=0;i<=aa.length()-1;i++)
		{
			//System.out.print(aa.charAt(i));
			if((i==4)||(i==5))
			{
				a[i]='e';
			}
		
		}
		String sp=a.toString();
		
		String[] sp1=sp.split("is");
		for(int o=0;o<=sp1.length-1;o++)
		{
		System.out.println(sp1[o]);
*/		}
	}
