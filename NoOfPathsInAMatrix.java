import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),m=sc.nextInt();
	    System.out.println(cal(n,m));
	}
	static int cal(int n,int m){
	    if(n==1||m==1)
	    return 1;
	    return cal(n-1,m)+cal(n,m-1);
	}
}
