package array.aug_24;

public class PrintArrayInReverse {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		printRecursive(arr, 0);
	}
	
	/**
	 * print array elements in reverse
	 * @param arr
	 * @param index
	 */
	private static void printRecursive(int arr[], int index) {
		//base case
		if(index >=arr.length) {
			return;//do nothing
		}
		
		//first recursive call
		printRecursive(arr, index+1);
		
		//then print element
		System.out.print(arr[index]+" ");
		
	}
	

}
