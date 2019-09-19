/*
Find the next ten consecutive primes value and display them in a series separated by spaces.
Time Limit
c/c++ 3s
Java 5s
For c++ use fast I/O

Input Format

N the starting number of series

Constraints

1<=n<=9*10^15

Output Format

Output the series as shown in sample test case

Sample Input 0

12

Sample Output 0

13 17 19 23 29 31 37 41 43 47 



*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        if(n==2)
        {
            c=c+1;
            n=n+1;
        }
        else
        {
            while(c!=10)
            {
                if(BigInteger.valueOf(n).isProbablePrime(1))
                {
                    c=c+1;
                    System.out.print(n+" ");
                    n=n+1;
                }
                n=n+1;
            }
        }
    }
}
