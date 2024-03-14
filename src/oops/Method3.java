package oops;

public class Method3 {
	public void add(int a,double b)
	{
		double value=a+b;
		System.out.println(value);
	}
	public void add(double a,int b)
	{
		double value=a+b;
		System.out.println(value);
	}
	

	public static void main(String[] args) {
		Method3 g=new Method3 ();
		g.add(3, 5.7);
		g.add(4.5, 5);
		

	}

}
