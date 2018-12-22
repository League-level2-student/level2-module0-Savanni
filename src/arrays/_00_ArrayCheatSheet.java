package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] x = { "array1", "array2", "array3", "array4", "array5" };
		// 2. print the third element in the array
		// System.out.println(x[2]);
		// 3. set the third element to a different value
		x[2] = "kellen";
		// 4. print the third element again
		// System.out.println(x[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }

		// 6. make an array of 50 integers
		int[] y = new int[50];

		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < y.length; i++) {
			y[i] = rand.nextInt(50);
		}
		int minimalvalue = y[0];

		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}

		System.out.println("");
		for (int i = 1; i < y.length; i++) {
			if (y[i] < minimalvalue) {
				minimalvalue = y[i];
			}
			// minimalvalue=(y[i]<minimalvalu)?y[i]:minimalvalue;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		System.out.println(minimalvalue);

		// 9 print the entire array to see if step 8 was correct
		
		// 10. print the largest number in the array.
		int maximumvalue = y[0];
		
		for (int i = 1; i < y.length; i++) {
			if (y[i] > maximumvalue) {
				maximumvalue = y[i];
			}
			
		}
		System.out.print(maximumvalue);
	}
}
