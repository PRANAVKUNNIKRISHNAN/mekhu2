package oops;


class bank
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
class sbi extends bank
{
	public void sbiintrest()
	{
		System.out.println("sbi intrest");
	}
	
	}
class Hdfc extends bank
{
	public void loan()
	{
		System.out.println("hdfc loan");
	}
}
public class Bank {
	public static void main(String[] args) {
		 sbi obj=new sbi();
		 Hdfc obj1=new Hdfc();

	}

}
