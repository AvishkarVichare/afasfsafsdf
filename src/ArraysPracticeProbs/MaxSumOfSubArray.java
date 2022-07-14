package ArraysPracticeProbs;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a={6,-7,4,-2,1,5,-4};

        System.out.println(maxSum(a));
    }

//time complexity O(N)
    static int maxSum(int[] arr){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum= Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

/*
time complexity O(N^3)

    static int maxSum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] +" ");

                    sum+=arr[k];

                }
                maxSum=Math.max(maxSum,sum);

                sum=0;

                System.out.println();

            }

        }
        return maxSum;

    }

 */
}
