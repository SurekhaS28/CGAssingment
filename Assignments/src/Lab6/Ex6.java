package Lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Ex6 {
	public static void main(String[] args) {
		HashMap<Integer,String>mp=new HashMap<>();
		mp.put(101,"1998-12-28");
		mp.put(102,"1999-01-26");
		mp.put(103,"2004-10-20");
		mp.put(104,"1978-06-21");
		mp.put(105,"2020-11-11");
		mp.put(106,"2000-08-28");
		System.out.println(votersList(mp));
	}

	public static List votersList(HashMap<Integer, String> mp) {
		LinkedList<Integer>ll=new LinkedList<Integer>();
		for(Entry<Integer,String>e : mp.entrySet())
		{
			LocalDate dob=LocalDate.parse(e.getValue());
			LocalDate curDate = LocalDate.now();
	        int a=Period.between(dob, curDate).getYears();
	        if(a>=18)
	        {
	        	ll.add(e.getKey());
	        }
		}
		return ll;
	}
}


