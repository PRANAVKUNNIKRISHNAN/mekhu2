package Assignment;

public class Arraylargest {

	public static void main(String[] args) {
		int arr[]= {30,40,50,20};
		int j=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(j<arr[i])
			{
				j=arr[i];
				
			}
		}
		System.out.println(j);

	}

}
