package oops;

public class Employeemethod {
	int empid;
	int salary;
	String designation;
	

	
	
	
	
	public void setvalues(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}
	public void display()
	{
		System.out.println("empid:"+empid);
		System.out.println("salary:"+salary);
		System.out.println("designation:"+designation);
	}
	public static void main(String[] args) {
		Employeemethod em=new Employeemethod();
		em.setvalues(20,300000 , "manager");
		em.display();
	}

		
		
			
		
		
	
	

	}


