package Controlstatements;

import java.util.Scanner;

public class Arithematicoperator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double num1,num2,result;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=s.nextDouble();
		System.out.println("Enter the second number:");
		num2=s.nextDouble();
		System.out.println("Enter the operation(+,-,*,/):");
		char operation= s.next().charAt(0);
		
		switch(operation) {
		case'+':
			result= num1+num2;
			System.out.println("Addition of two numbers is:"+result);
			break;
		case'-':
			result=num1-num2;
			System.out.println("Subtraction of two numbers is:"+result);
			break;
		case'*':
			result=num1*num2;
			System.out.println("Multiplication of two numbers is:"+result);
			break;
		case'/':
			result=num1/num2;
			System.out.println("Division of two numbers is:"+result);
			break;
			default:
				System.out.println("Invalid operation");
		}
	}


		}

	

