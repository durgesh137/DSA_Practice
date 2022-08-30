package array.aug_29;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * @author FSD_mates
 *
 */
public class MajorityElement169 {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 3 };
		MajorityElement169 obj = new MajorityElement169();
		int ans = obj.majorityElement(arr);
		System.out.println("Majority element: " + ans);
	}

	/**
	 * Finding the element which appears more than n/2 times within the array 
	 * NOTE-
	 * Majority element always appears in array
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] arr) {
		int len = arr.length;
		if (len <= 2) {
			// because arrray always contains 1 majority element
			return arr[0];
		} else {
			int ans = 0;
			// whenever matching element will be found,
			// we count the first element in advance
			int count = 1;

			Arrays.sort(arr);
			int i = 0;

			// works till i is less than last valid index
			while (i < len - 1) {
				if (arr[i] == arr[i + 1]) {
					count++;
					// check if count of matching element is more than half array length
					if (count > len / 2) {
						// store the current element as majority element
						ans = arr[i];
					}
				} else {
					count = 1;
				}
				i++;
			}
			return ans;
		}//else ends
	}
}
