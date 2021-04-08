package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		getSecondSmallest(arr);
	}

	private static void getSecondSmallest(int[] arr) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		Collections.sort(al);
		System.out.println(al.get(1));
	}

}
