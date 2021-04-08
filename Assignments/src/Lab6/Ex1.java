package Lab6;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Ex1 {
	public static void main(String[] args) {
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(26, "aravinth");
		hm.put(28, "surekha");
		hm.put(20, "pavi");
		hm.put(21,"priya");
		System.out.println(getValues(hm));
		
	}
	private static List getValues(HashMap<Integer,String>hm)
	{
		LinkedList<Integer>ll=new LinkedList<Integer>();
		LinkedList<String>ll1=new LinkedList<String>();
		for(Entry<Integer, String> e : hm.entrySet())
		{
			ll.add(e.getKey());
			ll1.add(e.getValue());
		}
		Collections.sort(ll);
		Collections.sort(ll1);
		return ll;
		//returnll1;
		
	}

}
