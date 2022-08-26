package array.aug_25;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,10,2,4,1};
		optimizedDuplicateCheck(arr);
		}
	
	/**
	 * way1 via HashSet
	 * method to check if array contains unique elements or not
	 * @param arr
	 * @return
	 */
	private static boolean optimizedDuplicateCheck(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int element : arr) {
			//add method returns true, if element is added successsfully
			//otherwise false is returned
			if(!set.add(element)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * way 2 to use hashset
	 * @param arr
	 * @return
	 */
	private static boolean optimizedDuplicateCheck2(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		//add all elements in set 
		for(int element : arr) {
			set.add(element);
		}
		//check if set size and array length are same, then all unique,
		//otherwise duplicate exist
		if(set.size() == arr.length) {
			//duplicates not there
			return false;
		}else {
			//since same number of elements are not there in set and array
			//that means duplicates exist
			return true;
		}
	}
	
	/**
	 * Brute force, O(n^2)
	 * @param arr
	 * @return
	 */
    public boolean containsDuplicate(int[] arr) {
        //O(nlogn) Arrays sort method

        boolean duplicateFound = false;
        for(int i=0; i<arr.length; i++){
            int element =arr[i];//1
            //search if element exists at other indexes in []
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == element){
                    //duplicate element found
                    duplicateFound = true;//1 found
                    break;
                }
            }//inner
        }//outer
        return duplicateFound;
    }

}
