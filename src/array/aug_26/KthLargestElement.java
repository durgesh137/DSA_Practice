package array.aug_26;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * 
 * @author FSD_mates
 *
 */
public class KthLargestElement {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 5, 6, 4 };
		int K = 3;
		System.out.println(findKthLargest(arr, K));
	}

	/**
	 * method finds the kth largest element in array using LinkedList, and
	 * Collections
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int findKthLargest(int[] arr, int k) {
		LinkedList<Integer> list = new LinkedList<>();
		for (Integer element : arr) {
			list.add(element);
		}

		int kthMax = 0;
		while (k > 0) {// k is 1
			kthMax = Collections.max(list);// largest
			if (list.contains(kthMax))
				list.remove(Integer.valueOf(kthMax));// 2
			k--;// k is 0
		}

		return kthMax;
	}

}

/**
 * //{1,2,2,3}, k is 3, // large 3, k is 3 //large 2, k=2 //large 2, k=1 //large
 * 1, k is 0
 */
