package ArraysPracticeProbs;

import java.util.Arrays;

public class frequencyOfAllItemsInArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,4};
        System.out.println(Arrays.toString(frequency(a)));

    }

    static int[] frequency(int[] arr){
        if(arr.length==1){
            return new int[]{1};
        }
        int[] ans = new int[arr.length];
        int i ;
        int j = 0;
        ans[0]=1;
       for( i=0;i<arr.length-1;i++){

           if(arr[i]==arr[i+1]){
               ans[j]++;
           }else {
               j++;
               ans[j]=1;
           }
       }

        return ans;
    }

}
