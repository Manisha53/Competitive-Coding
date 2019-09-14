//------------------2 testcases passed out of 10-------------------
import java.util.*;

class TestClass {
    
    public static ArrayList<Integer> increment(ArrayList<Integer> a,int val){
        if(val>=1 && val<=1000){
        for(int i=0;i<a.size();i++){
            int j=a.get(i);
            j+=val;
            a.set(i,j);
        }
        }
        return a;
    }
    
     public static ArrayList<Integer> decrement(ArrayList<Integer> a,int val){
         if(val>=1 && val<=1000){
        for(int i=0;i<a.size();i++){
            // a2.get(i)=a2.get(i)-val;
            int j=a.get(i);
            j-=val;
            a.set(i,j);
        }}
        return a;
    }
    
     public static int printLarge(ArrayList<Integer> a,int val){
         int l=a.size();
         int flag=0;
         if(val>l){
             flag=-1;
         }
         else{
              Collections.sort(a);
              flag=l-(val);
         }
       
        return (a.get(flag));
    }
    //--------------------------main--------------------------------------
    
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long q=in.nextLong();         //no. of queries
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(long i=0;i<q;i++){
                String s=in.next();
                
                switch(s){
                    case "A":                  //add
                        int x=in.nextInt();
                        a.add(x);
                        break;
                    case "I":
                        int inc=in.nextInt();
                        a=increment(a,inc);
                        break;
                    case "D":
                        int dec=in.nextInt();
                        a=decrement(a,dec);
                        break;
                    case "P":
                        int power=in.nextInt();
                        if(power>a.size()){
                            System.out.println(-1);
                        }
                        else{
                            int res=printLarge(a,power);
                            System.out.println(res);
                        }
                        
                        break;
                }
                
            }
        }

    }
}

