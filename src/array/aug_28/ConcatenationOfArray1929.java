package array.aug_28;

public class ConcatenationOfArray1929 {

	public static void main(String[] args) {

	}

	/**
	 * method provides the concatenated new array
	 * @param arr
	 * @return
	 */
	public int[] getConcatenation(int[] arr) {
		int n = arr.length;
		int ans[] = new int[2 * n];
		for (int i = 0; i < n; i++) {
			// copy ith element at ith position in ans
			ans[i] = arr[i];
			// copy ith element at i+nth position
			ans[i + n] = arr[i];
		}
		return ans;
	}
}
