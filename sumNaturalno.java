
public class Main
{
	public static void main(String[] args) {
	 System.out.println(summ(5));
	}
	    static int summ(int n){
	       if(n==0)
	       return 0;
	       return summ(n-1)+n;
	    }//	System.out.println("Hello World");
	
}
