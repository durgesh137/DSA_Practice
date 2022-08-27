package array.aug_27;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * 
 * @author FSD_mates
 *
 */
public class TrapRainWater {

	public static void main(String[] args) {
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		TrapRainWater water = new TrapRainWater();
		System.out.println(water.trap(height));
	}

	/**
	 * method to check amount of water that can be trapped 
	 * in complete array
	 * @param arr
	 * @return
	 */
	public int trap(int[] arr) {
		int start = 0;
		int waterCount = 0;
		int leftWall = 0;
		int rightWall = 0;
		int end = arr.length - 1;

		// works till both pointers are not at same position
		while (start < end) {//0, last

			if (arr[start] < arr[end]) {
				// start element is at least equal to leftWall

				if (arr[start] >= leftWall) {// 2>1
					leftWall = arr[start];// 1
				} else {
					// start element is less than leftWall
					waterCount += leftWall - arr[start];// 
				}
				start++;//1
			} else {
				// check if end element is at least equal to rightWall
				if (arr[end] >= rightWall) {
					rightWall = arr[end];//2
				} else {
					// otherwise, end element is lesser
					waterCount += rightWall - arr[end];
				}
				end--;
			}
		}
		return waterCount;
	}
}

////1 0 2 , water yes
////2 1 2, yes
//// 2 1 0 1 3, with each next element, nextEle -startingValue
//
////both sides non-zero value should be there
//	1. non-
//
//	zero value 2.
//	find next non-zero value,3.
//	now find total water that can be trapped in between
