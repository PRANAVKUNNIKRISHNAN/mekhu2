package basics;

public class Swapwithout {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=23;
		int b=25;
		
		System.out.println("value of a before swapping is :" + a);
		System.out.println("value of b before swapping is :" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swapping is:" +a);
		System.out.println("value of b after swapping is:"+b);
		

	}

}
