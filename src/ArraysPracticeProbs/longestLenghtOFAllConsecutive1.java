package ArraysPracticeProbs;

public class longestLenghtOFAllConsecutive1 {
    public static void main(String[] args) {
       // int[] a ={1,0,1,0,1,1,1,1,0};
        int[] a ={0,0,0};
        System.out.println(ans(a));
    }
    static int ans(int[] a){
        int ansLen = 0;
        int maxLength=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                ansLen++;
                maxLength=Math.max(ansLen,maxLength);
            }
            else {
                ansLen=0;
            }

        }
        if(ansLen==0){
            maxLength =0;
        }

        return maxLength;

    }
}
