package strings;

public class Anagram {

    static boolean checkAnagram(String s1, String s2){
        int[] arr = new int[256];

        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for(int i=0;i<s1.length();i++){
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(checkAnagram(s1,s2));
    }
}
