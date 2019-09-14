import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int k=in.nextInt();
       if(n==1 && k%2==1){
           System.out.println(-1);
       }
       long stack[]=new long[n];
       long max=0;
       for(int i=0;i<n;i++){
           stack[i]=in.nextLong();
           max=Math.max(stack[i],max);
       }
       
       if(k<=n){
           max=stack[k];
           for(int i=0;i<k-1;i++){
               max=Math.max(max,stack[i]);
           }
       }
        System.out.println(max);
    }
}
