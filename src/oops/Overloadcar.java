package oops;
class car{
public void speed()
{
	System.out.println("car speed");
}
public void power()
{
	System.out.println("car speed");
}

}
	class Bmw extends car{

		@Override
		public void speed() {
			System.out.println("Bmw speed");
			super.speed();
		}

		@Override
		public void power() {
			System.out.println("Bmw power");
			super.power();
		}
		
	}

public class Overloadcar {

	public static void main(String[] args) {
		Bmw sk=new Bmw();
		sk.speed();
		sk.power();
	}

		

	}

