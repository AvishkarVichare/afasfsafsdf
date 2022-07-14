package ArraysPracticeProbs;

import java.util.Arrays;

public class MoveAllZeroToEndOfArray {

    public static void main(String[] args) {
       int[] a = {1,0,0,3,0,4};
        //int[] a ={0,1};
        System.out.println(Arrays.toString(ansArray(a)));
    }

    static int[] ansArray(int[] arr){
        int[] ans = new int[arr.length];

        int j=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              ans[j]=arr[i];
              j++;
          }
      }
        return ans;
    }


}
