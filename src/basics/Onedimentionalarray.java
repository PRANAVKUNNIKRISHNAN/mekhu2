package basics;

import java.util.Scanner;

public class Onedimentionalarray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		
		}
		System.out.println("Entered values");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
