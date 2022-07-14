package array4;

import java.util.Arrays;

public class FindMaxJMinusI {


    static int findAns(int[] arr){
        int n = arr.length;

        int[] rightMax = new int[n];
        int[] leftMin = new int[n];
        rightMax[n-1]=arr[n-1];
        leftMin[0]=arr[0];
        for(int i=n-2;i>=0;i--){
            rightMax[i]= Math.max(rightMax[i+1],arr[i]);
        }

        for(int i=1;i<n;i++){
            leftMin[i]=Math.min(leftMin[i-1],arr[i]);
        }

        int i =0;
        int j=0;
        int sum  = 0;
                while(i<n && j<n){
                    if(rightMax[j]>leftMin[i]){
                        sum = Math.max(sum,j-i);
                        j++;
                    }
                    else {
                        i++;
                    }
                }
                return sum;

    }


    static  int findAns2(int[] a){
        int i =0;
        int j=a.length-1;
        int sum =0;
        while(i<j){
            if(a[j]>a[i]){
                sum = Math.max(sum,j-i);
                i++;
            }
            else {
                j--;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,6,8,2,6,9};
        System.out.println(findAns(a));
    }
}
