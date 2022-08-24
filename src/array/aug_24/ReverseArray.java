package array.aug_24;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 * @author FSD_mates
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
//		reverseArrayInPlace(arr, arr.length);
		reverseViaForLoop(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * i/p: {1,2,3,4,5}
	 * o/p: {5,4,3,2,1}
	 * 
	 * @param arr
	 * @param size
	 */
	public static void reverseArrayInPlace(int arr[], int size) {
		int start = 0, end = size -1;
		//0, 4 => 
		//1, 5 => swapping => 5 at 0 index, 1 at last index
		while(start < end) {
			
			//first element stored in temp
			int temp =arr[start];
			//last in start index
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;end--;
		}

		System.out.println("After reverse: ");
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}
	

	/**
	 * Reverse array in place
	 * @param arr
	 * @param size
	 */
	private static void reverseViaForLoop(int arr[]) {
		//array is traversed till half the array length
		int end = arr.length-1;
		for(int index=0;index<end/2; index++) {
			//store the indexth element from end
			int temp = arr[end-index];
			//put current index element at index indexth element from end
			arr[end-index] = arr[index];
			//store temp in current index
			arr[index] = temp;
		}
		
	}
}

