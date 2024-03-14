package oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		searchimage a=new searchimage();
//		a.message();
//		a.search();
        searchvideo b=new searchvideo();
        b.message();
        b.search();
	}

}

abstract class google
{
	abstract void search();
	public void message()
	{
		System.out.println("thank you for searching");
	}
}
class searchimage extends google{

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("thank you for searching image");
	}
		
	}
class searchvideo extends google{

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("thank you for searching video");
	}
		
	}








