package array.aug_28;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 * @author FSD_mates
 *
 */
public class TwoSum1 {
	public static void main(String[] args) {
		int arr[] = {-3,-4,3,9,0};
		int target = 0;
		TwoSum1 obj = new TwoSum1();
		int ans[] = obj.twoSum(arr, target);
		System.out.println(Arrays.toString(ans));
	}
	
	/**
	 * method to add unique elements to check if target is achieved
	 * @param nums
	 * @param target
	 * @return
	 */
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        //possible arrangements of adding unique elements together
        //1. adding consecutive elements and checking if target is achieved
        for(int i=0; i<nums.length-1; i++){
            if((nums[i] + nums[i+1]) == target){
                ans[0] = i;
                ans[1] = i+1;
                return ans;
            }
        }
        
        //2. adding  non-consecutive elements in pair to get target
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+2; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }                
            }
        }
        return ans;
    }

}
