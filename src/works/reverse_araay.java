package works;

import java.util.Scanner;

public class reverse_araay {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner s =new Scanner(System.in);
		System.out.println("Enter elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i] =s.nextInt();
		}
		System.out.println("\nOriginal array:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +"");
		}
		System.out.println("\nReversed order:");
		for (int i=arr.length -1;i>=0;i--) {
			System.out.print(arr[i]+"");
		}

	}

}
