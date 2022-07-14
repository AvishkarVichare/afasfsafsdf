package array4;

import java.util.Arrays;

public class ThreeSumProbelem {

    static boolean findThreeSum(int[] arr,int sum){
        int s =0;
        int e=arr.length-1;

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
                s=i+1;
            while (s<e){
                int currSum = arr[s]+arr[e]+arr[i];
                if(currSum>sum){
                    e--;
                }
                else if(currSum<sum){
                    s++;
                }
                else {
                    System.out.println(i+" "+s+" "+e);
                    return true;
                }
            }

        }
return false;
    }

    public static void main(String[] args) {

        int[] a ={10,20,70,100,120,40,50};
        int sum = 170;
        System.out.println(findThreeSum(a,sum));

    }
}
