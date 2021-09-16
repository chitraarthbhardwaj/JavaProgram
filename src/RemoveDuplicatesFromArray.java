
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) 
	{	
		
		int[] ar= {1,2,3,4,2,1,5,3,6,2};
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==(ar[j]))
				{
				//	ar[j]=ar.;
				}
				else
					continue;
			}
			System.out.print(ar[i]+" ");
		}
		

	}

}
