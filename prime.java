//2 3 5 7 11 13 17 19....
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	    int n=in.nextInt();   //number till which you want the series
	    System.out.println(2);
	    for(int i=2;i<=n;i++){
	        int flag=0;
	        for(int j=2;j<i;j++){
	            
	            if(i%j == 0){
	                flag=0;
	                break;
	            }
	            else{
	                flag=1;
	            }
	        }
	        if(flag==1){
	            System.out.println(i);
	        }
	    }
	}
}
