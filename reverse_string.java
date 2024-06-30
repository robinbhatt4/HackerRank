import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n=A.length();
        int a=0;
        int b=n-1;
       String str="Yes";
        for(int i=0;i<=n/2;i++)
        {
            if(A.charAt(a)!=A.charAt(b))
            {str="No";
            break;}
            a++;
            b--;
        }
        System.out.println(str);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



