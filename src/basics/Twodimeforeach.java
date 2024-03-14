package basics;

import java.util.Scanner;

public class Twodimeforeach {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
			}
		System.out.println("values are");
		for(int b[]:a)
		{
			for(int v:b)
			{
			System.out.print(v+" ");
			
			}
			System.out.println();
		}

	}

}
