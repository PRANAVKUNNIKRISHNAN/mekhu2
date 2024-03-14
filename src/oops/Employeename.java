package oops;

public class Employeename {
int empid;
int salary;
int deptno;
String empname;
public void display()
{
	System.out.println(empid);
	System.out.println(salary);
	System.out.println(deptno);
	System.out.println(empname);
}
public static void main(String[] args) {
	
	Employeename ob1=new Employeename();
	ob1.empid=101;
	ob1.salary=80000;
	ob1.deptno=20;
	ob1.empname="Anu";
	ob1.display();
	
	
	
}
}
