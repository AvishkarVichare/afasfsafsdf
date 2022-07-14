package arraysProblems;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] a = {1,8,6,2,4,5,8,3,7};

        System.out.println(ans(a));

    }


    static int ans(int[] arr){

        int s = 0;
        int e = arr.length-1;
        int maxArea = Integer.MIN_VALUE;

        while(s<e){
            int height = Math.min(arr[s],arr[e]);
            int area = height * (e-s);
            maxArea = Math.max(area,maxArea);
            if(arr[s]<arr[e]){
                s++;
            }
            else {
                e--;
            }
        }

        return maxArea;
    }

}
