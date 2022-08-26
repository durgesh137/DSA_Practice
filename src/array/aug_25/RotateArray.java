package array.aug_25;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		leftRotateArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * rotate the array towards left  
	 * @param arr
	 */
	private static void leftRotateArray(int[] arr){
        int firstElement = arr[0];//index 0 element

        //works from 0 till second last index of array
        for(int i=0;i<arr.length-1;i++ ){
            arr[i]=arr[i+1];
        }
        //once loop ends, last element is present twice in array right now
        
        arr[arr.length-1] = firstElement;
    }
}
