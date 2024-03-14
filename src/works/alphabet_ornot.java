package works;

import java.util.Scanner;

public class alphabet_ornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		System.out.println("Enter a character:");
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		if((c>='a'&&c<='z') ||(c>='A' &&c<='z'));
		System.out.println("alphabet"+c);
		
			System.out.println("not an alphabet"+c);
			

	}

}
