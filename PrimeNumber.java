import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
		if(Prime(n,2))
		System.out.println("PrimeNo.");
		else
		System.out.println("Not a Prime");
	}
	public static boolean Prime(int n,int k){
	    if(n<=1)
	    return false;
	    if(n==2)
	    return true;
	    if(n%k==0)
	    return false;
	    if(k+1<n){
	        Prime(n,k+1);
	    }
	    return true;
	}
}
