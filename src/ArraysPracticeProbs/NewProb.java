package ArraysPracticeProbs;

public class NewProb {

    static void ans (int[] arr, int sum){
        for(int i=0;i<arr.length-2;i++){
            int currsum =arr[i];

            for(int j=i+1;j<arr.length;j++){
                currsum += arr[j];
                if(currsum==sum){
                    System.out.println(i+" "+j);

                    return;
                }
                if(currsum>sum){
                    break;
                }

            }

        }
        return;
    }
    public static void main(String[] args) {
        int[] a ={3,4,2,6,1};
        int sum = 16;
        ans(a,sum);
    }
}
