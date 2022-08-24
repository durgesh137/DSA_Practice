package array.aug_24;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3,10,1};//4
		containsDuplicate(arr);
	}

	//HashMap, 
	/**
	 * brute force
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate(int[] nums) {
		boolean result = true;
		int ans = 0;
		//O(n^2)
		//1,2,3,1
		for(int i=0; i<nums.length; i++) {
			//i is 0, 
			int currElement = nums[i];//1
			//index 0 done, j is 3 to nums.length
			for(int j=i+1; j<nums.length; j++) {//1
				if(currElement == nums[j]) {//1, nums[j], j is 1, 2, 1 !=1
					return true;
				}
			}
		}
		return false;
	}
}
