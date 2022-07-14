package strings;

import java.util.Arrays;

public class ReverceStringNotWords {

    static void reverseWords(char[] c,int s, int e){
       while (s<e){
           char temp = c[s];
           c[s]=c[e];
           c[e]=temp;
           s++;
           e--;
       }
    }

static char[] ans(char[] a){
        int s=0;
        int e=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==' '){
            e=i;
            reverseWords(a,s,e-1);
            s = e+1;
        }
    }
    System.out.println(a);
    reverseWords(a,s,a.length-1);

  reverseWords(a,0,a.length-1);
return a;
}

    public static void main(String[] args) {
      char [] a = {'h','e','l','o',' ','b','y'};
        System.out.println(Arrays.toString(ans(a)));
    }
}
