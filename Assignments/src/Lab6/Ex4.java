package Lab6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex4 {
	public static void main(String[] args) {
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		hm.put(101, 95);
		hm.put(102, 90);
		hm.put(103, 85);
		hm.put(104, 80);
		hm.put(105, 75);
		hm.put(106, 70);
		getStudents(hm);
	}

	private static void getStudents(HashMap<Integer, Integer> hm) {
		for(Entry<Integer, Integer> e : hm.entrySet())	
		{
			if(e.getValue()>=90)
			{
				System.out.println(e.getKey()+": GOLD");
			}
			else if(e.getValue()>=80&&e.getValue()<90)
			{
				System.out.println(e.getKey()+": SILVER");
			}
			else if(e.getValue()>=70&&e.getValue()<80)
			{
				System.out.println(e.getKey()+": BRONZE");
			}
		}
		
	}

}
