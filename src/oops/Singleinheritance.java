package oops;
class Dog
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
	}
class cat extends Dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
	}

public class Singleinheritance {

	public static void main(String[] args) {
		cat c=new cat();
		c.barking();
		c.sleeping();

	}

}
