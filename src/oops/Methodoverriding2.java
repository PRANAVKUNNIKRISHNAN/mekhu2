package oops;
class parent{
	public void phone()
	{
		System.out.println("nokia");
	}
}
class child extends parent{
	public void phone()
	{
		System.out.println("iphone");
		super.phone();
	}
	
	}

public class Methodoverriding2 {

	public static void main(String[] args) {
		child c=new child();
		c.phone();
		

	}

}
