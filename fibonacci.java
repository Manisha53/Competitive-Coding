//without recursion
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=in.nextInt();
		int f=0;
		int s=1;
		System.out.print(f+" "+s);
		for(int i=0;i<n-2;i++){
		    int t=f+s;
		    System.out.print(" "+t);
		    f=s;
		    s=t;
		}
		
	}

}
//with recursion

import java.util.*;
public class Main {
    static int f=0;
    static int s=1;
    
    public static void fib(int n){
        for(int i=0;i<n;i++){
		    int t=f+s;
		    System.out.print(" "+t);
		    f=s;
		    s=t;
		}
    }
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=in.nextInt();
		
		System.out.print(f+" "+s);
		fib(n-2);
		
	}

}
