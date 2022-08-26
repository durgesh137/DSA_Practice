package array.aug_25;

import java.util.ArrayList;
import java.util.Arrays;

public class CoutingElementsInTwoArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 7, 9 };
		int arr2[] = { 0, 1, 2, 1, 1, 4 };
		countEleLessThanOrEqual(arr1, arr2, arr1.length, arr2.length);
	}

	/**
	 * method to find count of each arr1 elements in arr2
	 * @param arr1
	 * @param arr2
	 * @param m
	 * @param n
	 * @return
	 */
	public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
		// arr1 remain unsorted
		Arrays.sort(arr2);// n logn

		ArrayList<Integer> list = new ArrayList<>();// nlogn

		// O(n) for outer loop, overall O(n^2)
		for (int element : arr1) {
			// O(n) worst case
			int count = getCount(arr2, element);
			list.add(count);
		}

		return list;
	}

	/**
	 * Method to find count of an element in sorted array
	 * 
	 * @param arr2
	 * @param target
	 * @return
	 */
	private static int getCount(int arr2[], int target) {
		int count = 0;
		for (int i = arr2.length - 1; i >= 0; i--) {
			if (arr2[i] <= target) {// 4 0 == 0, true,
				count = i + 1;// 0+1, i+1
				break;
			}
		}

		return count;
	}

}

//target is 0,
//i is 5, last index
//i is 5,4,3,2,1,0, count is 1, worst case
