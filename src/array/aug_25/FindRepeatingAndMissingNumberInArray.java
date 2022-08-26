package array.aug_25;

public class FindRepeatingAndMissingNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2,2 };
		repeatingMissingElement(arr);
	}

	/**
	 * Method to find missing as well repeating element in array
	 * dry run is given at end
	 * @param arr
	 */
	private static void repeatingMissingElement(int[] arr) {
		int repeating = 0, missing = 0;
		int size = arr.length;

		// {1,2,2}
		//finding repeating element in array 
		for (int i = 0; i < size; i++) {
			int x = arr[i];// currElement
			// positive value of currElement, x
			int absX = Math.abs(x);
			
			if (arr[absX - 1] > 0) {
				arr[absX - 1] = -arr[absX - 1];
			} else {
				repeating = absX;
			}
		}//loop ends
		
		//finding missing element
		for(int i=0; i<size; i++) {
			int currElement = arr[i];
			if(currElement > 0) {
				missing = i+1;
			}
		}// loop ends

		System.out.println("Missing Element: "+missing);
		System.out.println("Repeating Element: "+repeating);
	}
}

/**
DRY-RUN for missing and repeating element
=========================================
arr = {1,3,4,1};

1->   i=0, x = arr[i] = 1
	  absX = Math.abs(x) = 1
	  arr[absX-1]>0 |arr[0]=1 > 0 -> true
	  make 1 -ve,arr[absX-1] , latest arr {-1,3,4,1}

2->  i=1; x=arr[i] = 3
	 absX = Math.abs(x) = 3
	 arr[absX-1] | arr[2] = 4>0 -> true
	 make 4 -ve , latest arr {-1,3,-4,1}
			
3->  i=2; x=arr[i] = -4
	 absX = Math.abs(x) = 4
	 arr[absX-1] | arr[3] =1 > 0 -> true
	 make 1 -ve, arr[absX-1] , latest arr {-1,3,-4,-1}

4-> i=3;x=arr[i] = -1
	absX = Math.abs(x) =1
	arr[absX-1] | arr[1-1] = -1>0 -> false
	else{		repeat = absX		}
		

FINDING MISSING ONE NOW...
latest arr {-1,3,-4,-1}
missing = 0
1-> i=0 ,arr[i] = -1 > 0 -> false , no condition

2-> i=1, arr[i] = 3>0 -> true 
missing = i+1 = 2 

ANS : repeating = 1, missing = 2
*/
