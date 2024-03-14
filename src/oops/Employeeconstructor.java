package oops;

public class Employeeconstructor {
int empid;
int salary;
String designation;

public Employeeconstructor()
{
	empid=20;
	salary=30000;
	designation="developer";
}
public static void main(String[]args) {
	Employeeconstructor em=new Employeeconstructor();
	System.out.println(em.empid);
	System.out.println(em.salary);
	System.out.println(em.designation);
}
		

	}


