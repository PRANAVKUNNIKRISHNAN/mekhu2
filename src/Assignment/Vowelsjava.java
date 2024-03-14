package Assignment;

public class Vowelsjava {

	public static void main(String[] args) {
		String s="hello mekha";
		char[] c=s.toCharArray();
		int vowels=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
				
			}
		}
		System.out.println(vowels);
	}


			
		
		
		
		
			
		
		// TODO Auto-generated method stub

	}


