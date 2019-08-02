
import java.util.*;
public class Main
{
    public static void dec2bin(int n){
        ArrayList<Integer> a=new ArrayList<Integer>();
        int l=0;
        while(n>0){
            
            a.add(n%2);
            n=n/2;
            l++;
        }
        
        for(int i=l-1;i>=0;i--){
            System.out.print(a.get(i));
        }
    }
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		dec2bin(n);
	}
}
