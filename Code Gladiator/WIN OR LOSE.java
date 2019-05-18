/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
       
        while(t-->0){
             int c=0;
            int n=in.nextInt();
           
            int p[]=new int[n];
            int v[]=new int[n];
            for(int j=0;j<n;j++){
               
                v[j]=in.nextInt();
             }
             for(int k=0;k<n;k++){
                 
                 p[k]=in.nextInt();
             }
             
             Arrays.sort(p);
             Arrays.sort(v);
            
        for(int i=0;i<n;i++){
            
            if(p[i]>v[i]){
                c++;
            }
            else{
                break;
            }
        }
        if(c==n){
            System.out.println("WIN");
        }
        else{
            System.out.println("LOSE");
        }
        }
   }
}
