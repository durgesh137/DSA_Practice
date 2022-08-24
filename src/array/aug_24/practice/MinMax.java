package array.aug_24.practice;

public class MinMax {
//find min and max element in array
	public static void main(String[] args) {
		int arr[] = {12,5,122,1,90, 100};
		//1,5,12, 90, 100,122 sorted array
		//5+4+3+2+1
		int maxElement = arr[0];//12
		for(int i=1; i<arr.length; i++) {//6
			if(maxElement < arr[i]) {//ith index, 1, 5 then 12<5, false
				maxElement = arr[i];
			}
		}
		System.out.println("Max element: "+maxElement);
		
	}
}

//1,2,3,4,5 original array
//5,4,3,2,1 reverse