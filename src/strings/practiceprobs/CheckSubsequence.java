package strings.practiceprobs;

public class CheckSubsequence {
//check  s in str
    static boolean check(String str,String s){
        int m = str.length();
        int n = s.length();

        for(int i=0;i<=m-n;i++){
            int j=0;
            for(;j<n;j++){
                if(str.charAt(i+j)!=s.charAt(j)){
                    break;
                }

            }
            if(j==n){
                //System.out.println(i+" "+j);
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        String str = "abbbskssccaabc";
        String s = "abc";
        System.out.println(check(str,s));
    }
}
