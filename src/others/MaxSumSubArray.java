package others;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * @author FSD_mates
 *
 */
public class MaxSumSubArray {
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//		naiveSolution(arr);
		betterApproach(arr);
	}

	private static void betterApproach(int arr[]) {
		int sumSoFar= 0, maxSum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			sumSoFar += arr[i];
			
			//check if sumSoFar is more than maxSum
			if(sumSoFar > maxSum) {
				maxSum = sumSoFar;
			}
			//check if sumSoFar is negative, then make it 0
			if(sumSoFar < 0) {
				sumSoFar = 0;
			}
		}
		System.out.println("Max sum in subArray: "+maxSum);
		
	}
	/**
	 * It fails for -2,1,-3,4,-1,2,1,-5,4, 
	 * => since under this[4,-1,2,1] is the max sum subarray, 
	 * => But in our solution, in each iteration,
	 * we are taking window which always ends at last index.
	 * While our result can't be obtained by going till last index,
	 * it lies in the middle
	 * @param arr
	 */
	private static void naiveSolution(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int currSum = 0;
			for(int j=i; j<arr.length; j++) {
				currSum += arr[j];
			}
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
		}
		System.out.println("Max sum subArray: "+maxSum);
	}
}
