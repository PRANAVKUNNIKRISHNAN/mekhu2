package works;

import java.util.Arrays;

public class array_sort {

	public static void main(String[] args) {
		int a[]= {10,60,50,70};
		System.out.println("enter the element of original array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		Arrays.sort(a);

		System.out.println("element of sorted array in acsending order:"+Arrays.toString(a));
	}

}
