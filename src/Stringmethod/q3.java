package Stringmethod;

public class q3 {

	public static void main(String[] args) {
		String s4="selenium webdriver is used for webapplication testing";
		String[] word=s4.split(" ");
		for(String m:word)
		{
			System.out.println(m);
		
		if(m.contains("webapplication")) 
		{
			break;
		}
			
		}
	}
}

	
	

	
