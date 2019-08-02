// print 2 5 8 11 ....
import java.util.*;
public class Main {
   
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int start=in.nextInt();
		int res=start;
		System.out.print(res+" ");
		for(int i=0;i<n-1;i++){
		    
		    res+=d;
		    System.out.print(res+" ");
		}
	}

}
