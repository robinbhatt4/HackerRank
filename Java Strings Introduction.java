import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n1= A.length()+B.length();
        System.out.println(n1);
        if(A.charAt(0)<=B.charAt(0))
        {
            System.out.println("No");
        }
        else
        System.out.println("Yes");
        
        System.out.println(A.toUpperCase().substring(0,1)+A.substring(1,A.length())+" "+B.toUpperCase().substring(0,1)+B.substring(1,B.length()));
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



