package works;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		int number,f=0;
		System.out.println("enter the number check if it prime or not");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int a;
		a=number/2;
		if(number==0||number==1)
		{
			System.out.println("number is not a prime");
		}else {
			for(int i=2;i<=a;i++) {
				if(number%i==0) {
					System.out.println("number is not a prime");
					f=1;
					break;
				}
				
				}
			if(f==0) {
				System.out.println("number is a prime");
			}
		}

	}

}
