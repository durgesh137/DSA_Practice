package array.aug_29;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 * 
 * @author Durgesh
 *
 */
public class MinimumOperationsToMakeArrayIncreasing1827 {

	public static void main(String[] args) {
		int arr[] = {1,1,1};
		MinimumOperationsToMakeArrayIncreasing1827 obj = new MinimumOperationsToMakeArrayIncreasing1827();
		int operations = obj.minOperations(arr);
		System.out.println("Minimum operations: "+operations);
	}

	/**
	 * minimum operations required to make array strictly increasing
	 * done in O(n)
	 * @param arr
	 * @return
	 */
    public int minOperations(int[] arr) {
    	if(arr.length <=1)
    		return 0;
        int count = 0;
        int pre = arr[0];
        int len = arr.length;
        int i=1;
        //works till complete array is traversed
        while(i < len){
            //check if current element is not greater than previous element
            if(arr[i] <= pre){
                //current element should be increased by difference of previous element
                //with  current element + 1
                int diff = pre - arr[i];
                arr[i] += diff + 1;
                //counting total increment operations performed so far
                count +=  + diff + 1;
            }
            //now update previous element with current element
            pre = arr[i];
            i++;
        }
        return count;
    }
	/**
	 * naive approach to find minimum number of operations needed to make array
	 * strictly increasing
	 * O(n^2)
	 * @param arr
	 * @return
	 */
	public int minOperationsNaiveApproach(int[] arr) {
		int count = 0;
		int pre = arr[0];
		int len = arr.length;
		int i = 1;
		while (i < len) {
			if (arr[i] <= pre) {
				// increment current element till
				// it is more than previous element
				while (arr[i] <= pre) {
					arr[i]++;
					count++;
				}
			}
			// now update previous element with current element
			pre = arr[i];
			i++;
		}
		return count;
	}
}

/**
 * 1827. An array nums is strictly increasing if nums[i] < nums[i+1] for all 
 * 0<= i < nums.length - 1. An array of length 1 is trivially strictly
 * increasing.
 */
