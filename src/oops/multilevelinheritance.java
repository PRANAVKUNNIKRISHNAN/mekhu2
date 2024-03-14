package oops;
class Doga
{
	public void eating()
	{
		System.out.println("dog is eating");
	}
	
	}
	class cata extends Doga
	{
		public void sleeping()
		{
			System.out.println("cat is sleeping");
		}
	}
	class lion extends cata
	{
		public void running()
		{
			System.out.println("Lion is running");
		}
	
		}
		
				
	
	
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lion c=new lion();
c.running();
c.sleeping();
c.eating();

	}

}
