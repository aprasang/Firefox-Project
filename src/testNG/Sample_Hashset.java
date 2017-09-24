package testNG;


import java.util.Iterator;
import java.util.LinkedHashSet;
import org.testng.annotations.Test;

public class Sample_Hashset {

	@Test
	public static void Hashset()
	{
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		//Set<Integer> hs=new Set<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		
		Iterator<Integer> it=hs.iterator();
		System.out.println(it.next());
				
	}
	
}
