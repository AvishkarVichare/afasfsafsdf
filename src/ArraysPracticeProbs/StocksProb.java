package ArraysPracticeProbs;

public class StocksProb {
    public static void main(String[] args) {
        int[] a ={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }

   static int maxProfit (int[] arr){
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];

            }
            else if(arr[i]-minPrice > maxProfit){
                maxProfit = arr[i]-minPrice;
            }
        }
        return maxProfit;
    }

       /*
        static int maxProfit(int[] prices) {
            int sum =0;
            int s =0;
            int maxSum = Integer.MIN_VALUE;
            int e= 0;
            for(int i=0;i<prices.length-1;i++){
                for(int j=i+1;j<prices.length;j++){
                    sum=  prices[j]-prices[i];
                    if(sum>maxSum){
                        maxSum = sum;
                        s=i;
                        e=j;
                    }
                }
            }

            return prices[e]-prices[s];
        }
        */

}
