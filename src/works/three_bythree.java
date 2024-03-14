package works;

public class three_bythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{9,6,3},
				{2,3,1},
				{8,4,5}
				
		};
		System.out.println("Original Matrix");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"");
			}
			System.out.println();
			}
		System.out.println("\nMatrix in Ascending order");
		int[] flatArray =new int[matrix.length*matrix[0].length];
		int index =0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				flatArray[index++]= matrix[i][j];
				
			}
		}
		for(int i=0;i<flatArray.length-1;i++) {
			for(int j=0;j<flatArray.length-1-i;j++) {
				if(flatArray[j]>flatArray[j+1]) {
					int temp =flatArray[j];
					flatArray[j]=flatArray[j+1];
					flatArray[j+1]=temp;
					
				}
			}
		}
		index=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=flatArray[index++];
				
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"");
			}
			System.out.println();
		}
	}
		}

	


