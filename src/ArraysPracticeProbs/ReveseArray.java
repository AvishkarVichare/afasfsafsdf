package ArraysPracticeProbs;

import java.util.Arrays;

public class ReveseArray {
    public static void main(String[] args) {
    int[] a={1,3};
        System.out.println(Arrays .toString(makeit(a)));
    }

    static int[] makeit(int[] a){
        for(int i=0;i< a.length/2;i++){
            int temp =a[i];

            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        return a;
    }
    }
