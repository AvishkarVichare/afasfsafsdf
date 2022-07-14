import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = { 2,4,1,6,3};
        int largest = 0;
        int secondLarge =-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondLarge=largest;
                largest=a[i];

            }
            else {
                if(a[i]>secondLarge){
                    secondLarge=a[i];
                }
            }
        }

        System.out.println(secondLarge);
    }
}
