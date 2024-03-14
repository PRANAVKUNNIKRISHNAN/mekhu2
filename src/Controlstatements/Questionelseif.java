package Controlstatements;

public class Questionelseif {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=13;
		int b=24;
		int c=46;
		if (a>=b && b>=c)
		{
			System.out.println("largest is a ="+a);
		}
		else if (b>=a && b>=c)
		{
			System.out.println("largest is b ="+b);
			
		}
		else
		{
			System.out.println("largest is c ="+c);
		}

	}

}
