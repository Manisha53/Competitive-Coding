// 1 1 2 3 4 9 8 27 16 81....... is a series of 2 G.P .Find the nth term of the series.
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		
		ArrayList<Integer> odd=new ArrayList<Integer>();
		ArrayList<Integer> even=new ArrayList<Integer>();
		for(int i=0;i<N;i+=2) {
			odd.add(arr[i]);
		}
		for(int i=1;i<N;i+=2) {
			even.add(arr[i]);
		}
		
		int n=in.nextInt();
	
		if(n%2==0) {  //even
			int r=even.get(1)/even.get(0);
			int index=n/2;
			int val=(int)Math.pow(r, index-1);
			int res=even.get(0)*val;
			System.out.println(res);
		}
		else {     //odd
			int r=odd.get(1)/odd.get(0);
			int index=n/2 + 1;
			int val=(int)Math.pow(r, index-1);
			int res=odd.get(0)*val;
			System.out.println(res);
		}
		
	}

}
