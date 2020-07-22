import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int m=sc.nextInt(),n=sc.nextInt();
	 System.out.println(power(n,m));
	}
	    static int power(int n,int m){
	       if(m==0)
	       return 1;
	       return power(n,m-1)*n;
	    }
	
}
