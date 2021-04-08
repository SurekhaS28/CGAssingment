package Lab6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getSorted(arr));
	}

	private static int getSorted(int[] arr) {
		//reverse the integer array
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
		}
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String str1=sb.toString();
		
		//sort the string value using collection
		LinkedList<Integer>ll=new LinkedList<Integer>();
		for(int i=0;i<str1.length();i++)
		{
			int a=Integer.parseInt(String.valueOf(str.charAt(i)));
			ll.add(a);
		}
		Collections.sort(ll);
		
		//return the value in integer
		String s="";
		for(int i=0;i<ll.size();i++)
		{
			s+=ll.get(i);
		}
		return Integer.parseInt(s);
	}

}
