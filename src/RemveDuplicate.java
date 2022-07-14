import java.util.Arrays;

public class RemveDuplicate {
    public static void main(String[] args) {
        int[] arr={2,2,3,3};
        System.out.println(Arrays.toString(removeDup(arr)));
    }
    static int[] removeDup(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            arr[j] = arr[i-1];
            if(arr[i]!=arr[j]){
                j++;
            }
        }
        return arr;
    }
}
