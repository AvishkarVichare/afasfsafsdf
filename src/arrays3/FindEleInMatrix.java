package arrays3;

public class FindEleInMatrix {

    static boolean check(int[][] a, int key){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=0;j--){
                if(key == a[i][j]){
                    System.out.println(i+" "+j);
                    return true;
                }
               else if(key>a[i][j]){
                    i++;
                }
               else {
                   j--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
            int key = 7;

        System.out.println(check(a,key));
    }
}
