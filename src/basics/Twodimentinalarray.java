package basics;

import java.util.Scanner;

public class Twodimentinalarray {

	public static void main(String[] args) {
		String a[][]=new String[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					a[i][j]=sc.next();
				}}
				System.out.println("values are");
				for(int i=0;i<3;i++)
				
					
				{
					for(int j=0;j<4;j++)
					{
						System.out.print(a[i][j]+" ");
						
					}
					System.out.println();
					
				}
			}
		}

	}


