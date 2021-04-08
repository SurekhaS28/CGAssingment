package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		getSquares(arr);
	}

	private static void getSquares(int[] arr) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int sq:arr)
		{
			map.put(sq, sq*sq);
		}
		System.out.println(map);
	}

}
