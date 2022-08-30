package array.aug_29;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-number-of-pairs-in-array/
 * 
 * @author FSD_mates
 *
 */
public class MaxPairs2341 {
	public static void main(String[] args) {
		int arr[] = {1,3,2,1,3,2,2};
		MaxPairs2341 obj = new MaxPairs2341();
		// size 2 array returned having pairs and leftovers
		int[] ans = obj.numberOfPairs(arr);
		System.out.println(Arrays.toString(ans));
	}

	/**
	 * O(nlogn)
	 * finding total possible pairs in array and 
	 * elements left in array without forming pairs
	 * @param nums
	 * @return
	 */
	public int[] numberOfPairs(int[] arr) {
        int ans[]= new int[2];
        int n=arr.length;
        //for array with length [0,1]
        if(n<=1){
            if(n == 1)
            ans[1] = 1;
            return ans;
        }
        //length more than 1, atleast 2
        Arrays.sort(arr);
        int pairs = 0;
        int i=0;
        //works from 0 till second last index
        while(i<n-1){
            if(arr[i] == arr[i+1]){
                pairs++;
                i+= 2;
            }else{
                i++;
            }
        }
        ans[0] = pairs;
        ans[1] = n-pairs*2;
        return ans;
	}
}
