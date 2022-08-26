package array.aug_25;

import java.util.Arrays;

/**
 * 
 * @author FSD_mates
 *
 */
public class ChocolateProblem {

	public static void main(String[] args) {
		int[] arr = {7, 3, 2, 4, 9, 12, 56};
		int m = 3 ;//students count
		minDifference(arr, m);
	}

	/**
	 * 
	 * @param arr
	 * @param m
	 */
	private static void minDifference(int[] arr, int m) {
		//sort the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int start =0, end = m-1;//number of student, 3,start index for m is 2
		
		//minimum value is max positive value possible in integers
		int minValue = Integer.MAX_VALUE;
		
		//star to end,0, 2
		//works till end is less than arr length
		while(end < arr.length) {
			//check if difference of end element and start element is less than 
			//minimum value so far
			if(arr[end] - arr[start]  < minValue) {
				minValue = arr[end] - arr[start];
			}
			//increment both end and start
			end++;
			start++;
		}
		System.out.println("min diff: "+minValue);
	}
	
	
	
}
