package array.aug_26;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
 * @author FSD_mates
 *
 */
public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int []prices = {7,1,5,3,6};
		BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
		System.out.println(b.maxProfit(prices));
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
    public int maxProfit(int arr[]) {
        int maxProfit = 0;
        int minPrice = arr[0];
        for(int i=1; i<arr.length; i++){
            int currPrice = arr[i];
            //check there is possibility to obtain profit
            if(currPrice > minPrice){
                maxProfit = Math.max(maxProfit, currPrice - minPrice);
            }else{
                //profit not possible
                //so update minPrice
                minPrice = currPrice;
            }
        }//loop ends
        return maxProfit;
    }	
	
    /**
     * naive approach to obtain max profit within array
     * @param arr
     * @return
     */
    public int maxProfitBruteForce(int[] arr) {
        //brute force
        int maxProfit = 0;

        //check for each day starting with 0 till end
        for(int  i=0; i<arr.length; i++){
            //pick price on ith day 
            int price = arr[i];
            //find out max price possible in all subsequent days
            //for the picked price [i+1, arr.length]
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > price){
                    int currProfit = arr[j]- price;
                    if(currProfit > maxProfit) {
                    	maxProfit = currProfit;
                    }
                }
            }
        }//loop end
        return maxProfit;
        
    }
}
