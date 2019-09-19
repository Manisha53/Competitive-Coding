import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char[] a=s.toCharArray();
        
        int l=s.length();
        if(a[l-1]=='0'){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
