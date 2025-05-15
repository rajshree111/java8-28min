package fibnocii;

public class Two2DArray {
	
	public static void main(String[] args) {
		
		int[] oneD1= new int[]{0, 1};
		
		System.out.println(oneD1[0]);
		System.out.println(oneD1[1]);
		
		
		//System.out.println(oneD1[2]);    // Index 2 out of bounds for length 2
		
		
		
		int[][] arr = {{0,1},{2,3}};	///Creates a 2-row array, each with 2 columns
		
		System.out.println(arr[0][0]);  //0
		System.out.println(arr[0][1]);  //1
		System.out.println(arr[1][0]);  //2
		System.out.println(arr[1][1]);  //3
		
		System.out.println(arr[0][2]);  // ArraysIndexOutOfBoundException
		
		
		//JAGGED ARRAY
		int[][] jaggedArray = {
			    {0, 1},
			    {2, 3, 4},
			    {5}
			};
  //jaggedArray[1] → 3 columns , jaggedArray[2]-> 1 column
		
	}

}
