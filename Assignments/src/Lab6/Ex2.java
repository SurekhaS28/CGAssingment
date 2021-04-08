package Lab6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[]c=str.toCharArray();
		countChar(c);
	}

	private static void countChar(char[] c) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch:c)
		{
			if(map.containsKey(ch))
			{
                map.put(ch, map.get(ch)+1);
			}
			else
			{
                map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
