package array.aug_29;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/
 * 
 * @author FSD_mates
 *
 */
public class RemoveElement27 {

	public static void main(String[] args) {
		int val = 2;
		int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		RemoveElement27 obj = new RemoveElement27();

		// index represent the position in arr ie, [0,index] till which val does not
		// exist in []
		int index = obj.removeElement(arr, val);
		System.out.println("index: " + index + "\nArray: " + Arrays.toString(arr));

	}

	/**
	 * Method to remove all occurrences of val from array inplace -> move start such
	 * that continuous duplicates does not get skipped
	 * 
	 * @param arr
	 * @param val
	 * @return
	 */
	public int removeElement(int[] arr, int val) {
		int n = arr.length;
		// array length is
		if (n == 1) {
			// val exists, then after removal length will 0
			if (val == arr[0]) {
				return 0;
			} else {
				// length is 1
				return n;
			}
		} else if (n == 0) {
			return n;// nothing will be there, empty array
		}
		// it will represent the index till which val does not exist
		// after shifting val to index after kth index
		int k = -1;
		// what val does not exist in []
		boolean exists = false;
		int start = 0, end = n - 1;
		while (start <= end) {
			if (arr[start] == val) {
				exists = true;
				if (k == -1)
					k = start;// index where val exists
				start++;
			} else {
				if (k != -1) {
					// start is index where val does not exist now
					// k is index where val exists
					// swap arr[k], arr[start]
					int temp = arr[k];
					arr[k] = arr[start];
					arr[start] = temp;
					// move start one step ahread of k
					// to ensure continuous occurring val does not get skipped
					// till k now all values other val exists
					// check from k + 1 now
					start = k + 1;
					k = -1;

				} else {
					start++;
				}
			}
		}
		if (!exists) // val does not exist in []
			return n;
		//k represents the length of array having k elements in it excluding val
		if (k == -1)
			k++;
		return k;
	}
}

/**
 * int val = 3;
 * int arr[] = {3,2,2,3};
*/