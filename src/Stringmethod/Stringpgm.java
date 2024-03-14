
package Stringmethod;

public class Stringpgm {

	public static void main(String[] args) {
		
		// length of a string
		String s="Welcome";
		int w=s.length();
		System.out.println("length:"+w);
		//join 2 string
		String s1="hello";
		String s2="luminar";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(1+2+s1);
		System.out.println(s1+1+2);
		
		//Uppercase and lowercase
		String s5="Luminar";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.endsWith("e"));
		System.out.println(s5.startsWith("L"));
		//compare two strings
		String a="abc";
		String b="Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		//System.out.println(a==b);
		//contains
		String g="welcome";
		System.out.println(g.contains("come"));
		//trim
		String q="   helo  ";
		System.out.println(q);
		System.out.println(q.trim());
		//extract portion
		String Y="welcome";
		System.out.println(Y.substring(3));
		System.out.println(Y.substring(0,4));
		//replace
		String W="welcome";
		System.out.println(W.replace("el","mn"));
		//to display particular character
		String z="welcome";
		System.out.println(z.charAt(4));
		//split
		String w1="Welcome to luminar";
		String[] words=w1.split(" ");
		for(String k:words)
		{
			System.out.println(k);
		}
		
		
		

	}

//tochararray
String t="hello";
char word[]=t.toCharArray();
for(char f1:word)
{
	System.out.println(f1);
}
}
}


