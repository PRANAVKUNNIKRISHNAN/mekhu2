package oops;

public class Parametorizedconstructer {
	int empid;
	String empname;
	
public Parametorizedconstructer(int id,String name)// Parameterizedconstructer
{
	empid=id;//or using this keyword in the case of same argument name
	empname="name";
	
}




	public static void main(String[] args) {
		Parametorizedconstructer s1=new Parametorizedconstructer(23,"mekha");
		System.out.println(s1.empid);
		System.out.println(s1.empname);
		
		
		
		
		
		
		

	}

}
