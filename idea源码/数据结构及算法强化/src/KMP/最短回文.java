package KMP;

import java.util.Arrays;
import java.util.Scanner;

public class 最短回文 {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();

        System.out.println(shortestPalindrome(""));

    }




    public static  String shortestPalindrome(String s) {
        if(s.equals(""))
            return null;
        char[] p= s.toCharArray();
        int len=p.length;
        char[] q=s.toCharArray();
        char c;
        for (int i=0;i<(len>>1);i++){
            c=q[i];
            q[i]=q[len-1-i];
            q[len-1-i]=c;
        }
        /*System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));*/
        int x=1;
        /*得到最大p和q最大的交错相同字符的数目*/
        for(int i=1;i<len;i++){
            int a=i;
            int b=len-1;
            boolean bl=true;
            while (a>=0) {
                if(p[a]!=q[b]){
                    bl=false;
                    break;
                }
                  a--;
                  b--;

            }
            if (bl==true){
                x=i+1;
            }




        }


        return String.valueOf(q).substring(0,len-x)+String.valueOf(p);
    }





}
