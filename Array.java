package arrays;

public class Array {

	public static void main(String[] args) {


		
		double[] array = {1.9, 2.9, 3.4, 3.5};
		
		System.out.println(array[1]);
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		double[][] array2 = {
							{0,1,2,3,4},
							{1.9, 2.9, 3.4, 3.5}
							};
		
		System.out.println(array2[0][3]);
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////				
		
		
		array2[0][3] = 5;

		System.out.println(array2[0][3]);
	}

}
