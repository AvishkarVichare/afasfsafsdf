package ArraysPracticeProbs;

public class MinimumSumSubArrayProblem {

    public static void main(String[] args) {
        int[] a = {1,-1,5,-3,1};
        System.out.println(minSumSub(a));
    }


    static int minSumSub(int[] arr){
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+= arr[i];
            minSum = Math.min(sum,minSum);

            if(sum>0){
                sum=0;
            }
        }

        return minSum;
    }


}
