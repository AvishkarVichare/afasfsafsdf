package arrays3;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] a = {2,3,1,-4,3,-2};
        System.out.println(check(a));
    }

    static boolean check(int[] arr){
        int sum = 0;
        Set<Integer> sumSet = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(sumSet.contains(sum)){
                return true;

            }

            sumSet.add(sum);
        }
        return false;
    }

}
