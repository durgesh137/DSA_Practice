package array.aug_24;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		//boolean to int
		//
		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};//7
		int m=5;
		Arrays.sort(arr);//ascending
		
		int size = arr.length;
		int minDiff = Integer.MAX_VALUE;
		
		//0 to 0tom-1,0to4, 8-5 is 3, i<=3 
		//1 1to5,
		//2, 2to6
		//3, 3to8
		for(int i=0; i<size - m; i++) {
			//m size window
			//arr[4] -arr[0] 
			int diff = arr[i+m-1]- arr[i];
			if(minDiff > diff) {
				minDiff = diff;
			}
		}
		
		System.out.println("min diff: "+minDiff);
		//arr[i+m-1]
		//m is 5, 0to4, i is 0
		//arr[0+5-1]
	}
}



//  m = 5
//1,3,4,7,9,9,12,56, sorted//8 length
//size 5,0 to 4, a[4] -arr[0], ans

//size 6, m =5
//0to4, 1to5
//for i=0, i<arr.length-m; i++
//8-5 is 3, i<3, i=0,1,2		
//i=0, 0 to 4, a[4] -arr[0], ans
		


//1,3,4,7,9,
//3,4,7,9,9
//4,7,9,9,12
//7,9,9,12,56



//3,4,1,9,7
//9-1 is 8

//3,4,7,9,9
//{3, 4, 1, 9, 56, 7, 9, 12}




















//Input : arr[] = 
//{7, 3, 2, 4, 9, 12, 56} , m = 3
//2, 3,4
//minChocolatePacket is 2 
//maxChocolatePacket is 4
//max-min , 4 - 2 is 2
//Output: Minimum Difference is 2 

