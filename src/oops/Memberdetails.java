package oops;
class Members
{

String name;
int age;
String adress;
double salary;
void printdetails()
{
	System.out.println("name"+name);
	System.out.println("age"+age);
	System.out.println("adress="+adress);
	System.out.println("salary"+salary);
}
}
class worker extends Members{
	String specialization;
}
	class Manager extends Members
	{
		String department;
	}
	




















public class Memberdetails {

	public static void main(String[] args) {
	worker w=new worker();
	

	}

}
