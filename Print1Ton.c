#include <stdio.h>
void rec(int);
int main() {
    int t,n;
    scanf("%d",&t);
    while(t-->0){
        scanf("%d",&n);
    rec(n);
      printf("\n");
    }
    	return 0;
}
    void rec(int n){
        if(n==0)
        return;
        rec(n-1);
        printf("%d ",n);
    }
	//code
