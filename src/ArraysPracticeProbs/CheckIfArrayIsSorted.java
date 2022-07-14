package ArraysPracticeProbs;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] a={2,13,5,6};
        check(a);
    }

    static void check(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }

}
