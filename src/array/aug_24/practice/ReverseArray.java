package array.aug_24.practice;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};//
		for(int i=arr.length-1; i>=0; i--) {
			int temp = arr[i];
			System.out.print(arr[i] + " ");//5,i=4 
		}
	}
}

