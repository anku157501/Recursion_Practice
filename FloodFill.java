// public class Main
// {
// 	public static void main(String[] args) {
// 	   int r=5,c=5;
// 	    int[][] a={{1,2,1,3,2},
// 	                 {2,2,1,2,2},
// 	                 {2,2,2,1,1},
// 	                 {3,3,2,4,1},
// 	                 {1,2,1,1,1}};
// 	  int tofill=0,prevfill=2;
// 	   FloodFill(a,r,c,tofill,prevfill);
// 	   printMtrix(a);
	    
// 	//	System.out.println("Hello World");
// 	}
// 	static void FloodFill(int a[][],int r,int c,int tofill,int prevfill){
// 	    int cols=a[0].length;
// 	    int rows=a.length;
// 	    if(r<0||c<0|c>=cols||r>=rows)
// 	    return;
// 	    if(a[r][c]!=prevfill)
// 	    return;
// 	    a[r][c]=tofill;
// 	    FloodFill(a,r-1,c,tofill,prevfill);
// 	    FloodFill(a,r,c-1,tofill,prevfill);
// 	    FloodFill(a,r,c+1,tofill,prevfill);
// 	    FloodFill(a,r+1,c,tofill,prevfill);
// 	}
// 	static void printMtrix(int a[][]){
// 	    for(int i=0;i<a.length;i++){
// 	        for(int j=0;j<a[0].length;j++)
// 	            System.out.print(a[i][j]);
// 	        System.out.println();
//         }
// }
// }


public class Main
{
	public static void main(String[] args) {
	   int r=5,c=5;
	    int[][] a={{1,2,1,3,2},
	                 {2,2,1,2,2},
	                 {2,2,2,1,1},
	                 {3,3,2,4,1},
	                 {1,2,1,1,1}};
	  int tofill=0,prevfill=2;
	  r=2;c=1;
	   FloodFill(a,r,c,tofill,prevfill);
	  printMtrix(a);
	 }
	static void FloodFill(int a[][],int r,int c,int tofill,int prevfill){
	    int cols=a[0].length;
	    int rows=a.length;
	    if(r>=rows||r<0||c<0||c>=cols)
	        return;
	    if(a[r][c]!=prevfill)
	        return;
	    a[r][c]=tofill;
	    
	    FloodFill(a,r-1,c,tofill,prevfill);
	    FloodFill(a,r,c-1,tofill,prevfill);
	    FloodFill(a,r+1,c,tofill,prevfill);
	    FloodFill(a,r,c+1,tofill,prevfill);
	}
 	static void printMtrix(int a[][]){
 	    for(int i=0;i<a.length;i++){
 	        for(int j=0;j<a[0].length;j++)
 	            System.out.print(a[i][j]);
 	        System.out.println();
         }
}
}
