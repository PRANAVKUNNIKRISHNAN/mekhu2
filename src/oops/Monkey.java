package oops;
interface basicanimal{
	void cat();
	void sleep();
	void speak();
}
 class Monkey1 {
void jumb() {
	System.out.println("monkey is jumping");
}
void bite() {
	System.out.println("monkey is bite");
}
class human extends Monkey implements basicanimal{

	@Override
	public void cat() {
System.out.println("run");		
	}

	@Override
	public void sleep() {
System.out.println("sleep");		
	}

	@Override
	public void speak() {
System.out.println("speak");		
	}

	
	
}








public class Monkey{
	


	public static void main(String[] args) {
		human hk=new human();
		hk.sleep();
		hk.speak();
		
	

	}

}
