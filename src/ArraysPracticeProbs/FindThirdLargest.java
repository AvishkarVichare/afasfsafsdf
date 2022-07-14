package ArraysPracticeProbs;

public class FindThirdLargest {
    public static void main(String[] args) {
        int[] a ={2,5,7,3,8};
        System.out.println(thirdLargest(a));
    }


    static int thirdLargest(int[] a) {
        int largest = Integer.MIN_VALUE+2;
        int secondLarge = Integer.MIN_VALUE+1;
        int thirdLarge = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                thirdLarge=secondLarge;
                secondLarge=largest;
                largest=a[i];

            }
            else {
                if(a[i]>secondLarge){
                    thirdLarge=secondLarge;
                    secondLarge=thirdLarge;
                }
            }
        }
        return thirdLarge;

    }

}