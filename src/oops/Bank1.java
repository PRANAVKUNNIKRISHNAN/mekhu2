package oops;

class Bank1
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
}
class sbi1 extends Bank1
{
	public void sbiintrest()
	{
		System.out.println("sbi1 intrest");
	}
	
	}
class Hdfc1 extends Bank1
{
	public void loan()
	{
		System.out.println("hdfc1 loan");
	}



















	public static void main(String[] args) {
		sbi1 obj=new sbi1();
		Hdfc1 obj1=new Hdfc1();
	

	}

}
