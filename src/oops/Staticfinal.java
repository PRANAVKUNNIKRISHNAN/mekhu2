package oops;

public class Staticfinal {

	public static void main(String[] args) {
	 
		System.out.println(school.department);
		System.out.println(school.department="malayalam");
		System.out.println(school.department);
		school ob=new school();
		System.out.println(ob.schoolname);
	}

}
class school
{
	static String department="english";
	final String schoolname="Luminar";		
}

