package array4;

import java.util.Arrays;

public class NewPRob {
     static int solve(int N, int a, int[] x) {
        // code here
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            int temp = x[i] - a;
            if(temp<0){
                temp = -1 * temp;
            }
            arr[i] = temp;
        }
         Arrays.sort(arr);

        return arr[N-1]+arr[N-2];
     //   int firstSum = arr[0]+arr[1];

     //   int currSum = firstSum;
      /*
        for(int i=2;i<N;i++){
            currSum+=arr[i]-arr[i-2];
            firstSum = Math.max(currSum,firstSum);
        }
       */
     //   return firstSum;

    }
    public static void main(String[] args) {
      //  int[] x = {9 ,9, 3, 1, 7, 9, 5, 6, 5, 4};
        int[] x ={10,4,2,17};
        System.out.println(solve(4,2,x));
    }
}
