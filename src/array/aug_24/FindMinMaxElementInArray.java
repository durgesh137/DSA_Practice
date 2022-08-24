package array.aug_24;

/**
 * https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 * @author FSD_mates
 *
 */
public class FindMinMaxElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 5, 30, 12 };// 5 element

		System.out.println("Array elements are: ");
		for (int element : arr) {
			System.out.print(element + " ");
		}

		// max and min element initialized with first element, 10
		int maxElement = arr[0], minElement = arr[0];

		for (int i = 0; i < arr.length; i++) {// 0,1,2,3,4
			//check if maxElement is less than ith element
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
			//check if ith element is less than minElement
			if (arr[i] < minElement) {
				minElement = arr[i];
			}
		}

		System.out.println("\nMax: " + maxElement + " minElement: " + minElement);
	}
}
