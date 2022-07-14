//write pro to replace every element with greatest element on its right

package ArraysPracticeProbs;

import java.util.Arrays;

public class GreatestElementOnRight {
    public static void main(String[] args) {
        int[] a = {7,5,8,9,6,8,5,7,4,6};
        System.out.println(Arrays.toString(ans(a)));
    }

    static int[] ans(int[] arr){
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i+1]>=arr[i]){
                arr[i]=arr[i+1];
            }
        }
        return arr;

    }

}
