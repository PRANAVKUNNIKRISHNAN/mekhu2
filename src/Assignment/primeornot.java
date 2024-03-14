package Assignment;

public class primeornot {

	public static void main(String[] args) {
		int num =50;
		boolean d = false;
		for (int i=2; i<=num/2; i++) {
			if(num% i==0) {
				d = true;
				break;
			}
			}
		if (!d) {
			System.out.println(num +"is a prime");
		}else {
			System.out.println(num +"is not prime");
		}
		

	}

}
