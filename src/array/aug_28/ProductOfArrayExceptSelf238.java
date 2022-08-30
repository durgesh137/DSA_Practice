package array.aug_28;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 * 
 * @author FSD_mates
 *
 */
public class ProductOfArrayExceptSelf238 {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 1, 4 };
		ProductOfArrayExceptSelf238 obj = new ProductOfArrayExceptSelf238();
		int ans[] = obj.productExceptSelf(arr);
		System.out.println("Result: " + Arrays.toString(ans));
	}

	/**
	 * Method provides the int[] having product of all elements except itself
	 * 
	 * @param arr
	 * @return
	 */
	public int[] productExceptSelf(int[] arr) {
		int n = arr.length;
		int newArray[] = new int[n];

		int product = 1, zeros = 0;
		// computing product of all elements of arr
		for (int i = 0; i < arr.length; i++) {
			// check if current element is zero
			if (arr[i] == 0) {
				zeros++;
				if (zeros > 1)
					return newArray;// all elements would be zero
			} else {
				product = product * arr[i];
			}
		}
		// now at max 1 zero can be there within array
		if (zeros == 1) {
			for (int i = 0; i < n; i++) {
				// only zero value element will have non-zero value as product
				if (arr[i] == 0) {
					newArray[i] = product;
				}
				// left elements will be zero, since one element is zero
			}
		} else {
			// any zero does not exist
			for (int i = 0; i < n; i++) {
				newArray[i] = product / arr[i];
			}
		}

		return newArray;
	}
}
