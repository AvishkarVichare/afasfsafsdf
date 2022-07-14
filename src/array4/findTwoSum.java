package array4;

public class findTwoSum {

    static boolean findIfSum(int[] arr,int sum) {
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            int currSum = arr[i] + arr[j];
            if(currSum>sum)
                j--;
            else if(currSum<sum)
                i++;
            else{
                System.out.println(i+" "+j);
                return true;

            }
        }

        /*

        for (j = 0; j < arr.length; j++) {
            for (i = j+1; i < arr.length; i++) {
                if (sum - arr[i] ==arr[j] ){
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }

         */
        return false;

    }

    public static void main(String[] args) {
        int[] a={1,2,7,8,10,12};
        int sum = 20;
        System.out.println(findIfSum(a,sum));
    }
}
