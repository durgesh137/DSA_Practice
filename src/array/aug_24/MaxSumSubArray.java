package array.aug_24;

/**
1.  -1,-1,-2,-3,-5,10
//largest sub subarray 10

2. -1,-1,-2,3,-5,-10
//maxsum is 3

3. -1,-1,-2,3,4,-5,-10
//maxSum is 3+4 is 7

4. -1,-1,-2,3,-1,4,-5,-10
//6 is maxSum

5. -11,-3,-5, -9, -10
//maxSum is -3
 
 * @author FSD_mates
 *65,535, -65,534
 */
public class MaxSumSubArray {
	private static void maxSum(int arr[]) {
		//Integer.M
		int maxSum = Integer.MIN_VALUE;//-65,534
		int currSum = 0;
		
		for(int i=0;i<arr.length; i++) {//i is 1
			//add currSum with ith element
			currSum += arr[i];
			
			if(currSum > maxSum) {// -2, -1
				maxSum = currSum;//-1
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
			
		}
		System.out.println("Max Sum: "+maxSum);
	}
	
	public static void main(String[] args) {
//		int arr[] = {-11,-3,-5, -9, -10};
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		maxSum(arr);
	}
}

//{1,2,3,4,5};//
//0 to 4 index
//0,1,2,3,4
//0to1, 1to2, 2to3, 3to4
//0to2, 1to3, 2to4
//1to3

//{-1,4,-1,3,8,-2,1}
//4+3+5-2+1 is 11 
//0 to last
//1 to last
//2 to last
//last element











