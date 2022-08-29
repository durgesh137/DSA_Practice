package array.aug_28;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/decode-xored-array/
 * @author FSD_mates
 *
 */
public class DecodeXORedArray1720 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int first = 1;
		int originalOne[] = new DecodeXORedArray1720().decode(arr, first);
		System.out.println(Arrays.toString(originalOne));
	}
	/**
	 * method to decode the encoded [] using xor operations
	 * @param encoded
	 * @param first
	 * @return
	 */
    public int[] decode(int[] encoded, int first) {
        //original array is one length more than encoded one
        int ans[] = new int[encoded.length+1];
        ans[0] = first;
        int j=1;
        //traverse from 0 till encoded legnth
        for(int i=0; i<encoded.length; i++){
            //store XOR of ith element of encoded and ans arrays 
            //at jth index
            ans[j] = encoded[i] ^ ans[i];
            j++;
        }
        return ans;
    }
}
