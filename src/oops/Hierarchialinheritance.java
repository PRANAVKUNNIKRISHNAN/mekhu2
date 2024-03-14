package oops;
class dogu{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}
class catu extends dogu
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
	}
class lionu extends dogu
{
	public void running()
	{
		System.out.println("lion is running");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
catu c=new catu();
c.barking();
c.sleeping();
lionu n=new lionu();
n.barking();
n.running();

	}

}
