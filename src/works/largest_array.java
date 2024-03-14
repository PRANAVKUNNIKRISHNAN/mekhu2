package works;

public class largest_array {
	static int arr[]= {10,60,50,70};
	static int largearray()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		System.out.println("largest element is"+largearray());

	}

}
