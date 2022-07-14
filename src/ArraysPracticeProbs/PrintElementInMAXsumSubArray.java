package ArraysPracticeProbs;

public class PrintElementInMAXsumSubArray {

    public static void main(String[] args) {
        int[] a={6,-7,4,-2,1,6,-4};
printIt(a);
    }

   static void printIt(int[] a){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        int s=0;
        int e=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>maxSum){
                maxSum = sum;
                e=i+1;
            }
            if(sum<0){
                sum=0;
                s=i+1;
                e=s+1;
            }

        }

        for(int i=s;i<e;i++){
            System.out.print(a[i]+" ");
        }
       System.out.println("max sum of subarray is "+maxSum);


    }

}
