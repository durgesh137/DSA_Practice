package array.aug_28;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 * 
 * @author FSD_mates
 *
 */
public class ShuffleArray1470 {

	public static void main(String[] args) {
		ShuffleArray1470 obj = new ShuffleArray1470();
		int nums[] = {2,5,1,3,4,7};
		int n=3;
		int shuffled[] = obj.shuffle(nums, n);
		System.out.println(Arrays.toString(shuffled));
	}

	/**
	 * method to shuffle the array using auxillary array
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public int[] shuffle(int[] arr, int n) {
		// temporary array
		int[] arr2 = new int[arr.length];

		// traversing from 0 till array length
		for (int i = 0, j = 0; i < n; i++, j += 2) {
			// storing ith and i+nth element at j and j+1 index in arr2
			arr2[j] = arr[i];
			arr2[j + 1] = arr[i + n];
		}
		return arr2;
	}

}
