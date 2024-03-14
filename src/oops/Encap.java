package oops;
class Encapl
{

private String name;
private String designation;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}
}

public class Encap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapl ob=new Encapl();
ob.setName("pranav");
System.out.println(ob.getName());
ob.setDesignation("tester");
System.out.println(ob.getDesignation());
}}