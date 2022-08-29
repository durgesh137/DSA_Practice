package array.aug_27;

import java.util.Arrays;

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
		System.out.println(water.trap2(height));
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
	
	/**
	 * method to find out amount of water that can be stored within the array
	 * Space complexity = O(n)
	 * all testcases passed
	 * @param arr
	 * @return
	 */
	public int trap2(int[] arr) {
		int water = 0;
		//1. Moving from left to right
		//a. At any element max amount of water that can be possible to be stored is equal to
		//largest value found from left till that element
		
		int left = arr[0];
	    int aLeft [] = new int[arr.length];
		//lets populate max left value at each element first
		int k=0;
	    for(int element : arr){
	        if(element > left){
	            left = element;
	        }
	       aLeft[k++] =  Math.max(left, element);
	    }//3,3,3,4,4,4,4-> left[]
	    
		//2. moving from right to left
		//=> Max water possible to be stored at any element is max value found in right 
		//of that element
		//lets populate max right value at each element first
        k=0;
        int aRight[] = new int[arr.length];
        int right = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > right){
                right = arr[i];
            }
            //finding maxValue possible at each element
            aRight[i] = Math.max(right, arr[i]);
        }	    
        
        System.out.println("Original[]: "+Arrays.toString(arr));
        System.out.println("left[]: "+Arrays.toString(aLeft));
        System.out.println("right[]: "+Arrays.toString(aRight));
        
        //At each index i, max water level possible should be min value 
        //b/w aLeft[i] and aRight[i]. 
        //But the value of a[i] would reduce the effective water level
        //so max Water possible = Math.min(aLeft[i], aRight[i) - arr[i]

        //lets find out actual amount of water possible to store within []
        for(int i=0; i<arr.length; i++){
            int level = Math.min(aLeft[i], aRight[i]); //max water possible to be stored
            water += level - arr[i];
        }
		return water;
	}
	
	/**
	 * Find out how much water can be trapped in array
	 * @param arr
	 * @return
	 */
	 private static int trapWater3(int[] arr) {
	        int maxHeight = arr[0],waterStored=0,index = 0;
	        /*
	         * first find the max value
	         */
	        for(int i = 1; i < arr.length; i++){
	            if(maxHeight<arr[i]){
	                maxHeight = arr[i];
	                index = i;
	            }
	        }
	        int first = 0, middle = index, last = arr.length-1,temp1 = arr[first], temp2 = arr[last];
	        /*
	         * 1 : move from Left to right(middle) 
	         * 2 : move from Right to left(middle)
	         */
	        while(first < middle || last > middle){
	            /*
	             * checks if first less then middle index
	             * middle is the index where max value resides in array
	             */
	            if(first < middle){
	                if(arr[first] >= temp1){
	                    temp1 = arr[first];
	                }else{
	                    waterStored += Math.abs(temp1 - arr[first]);
	                }
	                first++;
	            }
	            /*
	             * checks if last grater then middle index
	             * middle is the index where max value resides in array
	             */
	            if(last > middle){
	                if(arr[last] >= temp2){
	                    temp2 = arr[last];
	                }else{
	                    waterStored += Math.abs(temp2 - arr[last]);
	                }
	                last--;
	            }

	        }
	        return waterStored;
	    }
	
}

