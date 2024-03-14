package oops;

class Abc
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
		






public class Members {
	
		

	public static void main(String[] args) {
	worker workers=new worker();
	workers.name="anil";
	workers.age=25;
	workers.adress="256 kottayam";
	workers.salary=10000;
	workers.specialization="developer";
	System.out.println("worker details");
	workers.printdetails();
	Manager manager=new Manager();
	manager.name="Deepak";
	manager.age=38;
	manager.adress="458ekm";
	manager.salary=75000;

	manager.printdetails();
	}

	}


