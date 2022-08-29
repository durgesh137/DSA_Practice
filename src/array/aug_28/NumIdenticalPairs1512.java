package array.aug_28;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * 
 * @author FSD_mates
 *
 */
public class NumIdenticalPairs1512 {

	public static void main(String[] args) {
		int nums [] = {1,2,3,1,1,3};
		NumIdenticalPairs1512 obj = new NumIdenticalPairs1512();
		System.out.println(obj.numIdenticalPairs(nums));
	}
	
	private static int countPairs(int nums[]) {
		int pairs = 0;
		Arrays.sort(nums);//O(nlogn)
		int pre = nums[0];
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1])
				pairs++;
		}
		return pairs;
	}

	/**
	 * naive approach to count all identical pairs in array such
	 * that i<j
	 * complexity: O(n^2)
	 * @param nums
	 * @return
	 */
	public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i=0; i<nums.length-1; i++){
        	//searching possible pair in nums[] starting with i+1
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    pairs++;
            }
        }
        return pairs;
    }
}

/**
 * TEST CASES
 * [1,2,3,1,1,3]
 * [1,1,1,1]
 * [1,2,3]
 */
