import java.util.ArrayList;
import java.util.List;

public class collectionArrayListAddElements 
{

	public static void main(String args[])
	{
	ArrayList<String> ar=new ArrayList<String>();
	
	ar.add("test");
	ar.add("test");
	ar.add("testy");
	
	for(int i=0;i<ar.size();i++)
	{
		if(ar.get(i)=="test")
		{
			System.out.println("yes");
		}
		else
			System.out.println(ar.get(i));
	}
	System.out.println(ar.size());
	ar.remove(2);
	System.out.println(ar.size());
	ar.add("testying");
	System.out.println(ar.size());
	ar.clear();
	System.out.println(ar.size());
	for(int k=0;k<=20;k++)
	{
		ar.add("testing:"+k);
	}
	System.out.println(ar.contains("testing:5"));
	ar.removeAll(ar);
	System.out.println(ar.size());
	for(int k=0;k<=20;k++)
	{
		ar.add("testing:"+k);
	}
	ar.set(6, "testingtypes7");
	System.out.print(ar.get(6));
}
}
