package Examjava;

public class Reverse_string {

	public static void main(String[] args) {
		String s="Luminar Lab";
		String rev=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		}

	}


