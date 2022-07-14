package binarySearch;

public class SearchInRotatedArray {


    //find pivot code
    static int findPivot(int[] arr){
        int s =0;
        int e= arr.length;
        int mid =0;
        while(s<e){
            mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<arr[s]){
                e = mid-1;
            }
            else if(arr[mid]>arr[s]){
                s = mid;
            }
            else{
                return s;
            }
        }
        return -1;
    }



    static int findElement(int[] arr, int key){
        int pivot = findPivot(arr);
        int  s=0;
        int e = arr.length-1;
        if(key==arr[0]){
            return 0;
        }
        if(key<arr[0]){
            s=pivot+1;
        }else{
            e = pivot;
        }
        int mid =0;
        while (s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                e = mid -1;
            }
            else {
                s = mid+1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,6};
        System.out.println(findElement(arr,1));
    }
}
