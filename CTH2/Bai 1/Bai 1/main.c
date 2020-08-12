
//  main.c
//  Bai 1

#include <stdio.h>
#include <stdlib.h>
#include "math.h"
#include <time.h>

int nhap(){
    int n = 0;
    printf("Nhap vao n: ");
    scanf("%d",&n);
    return n;
}
void xuat(int n, int m, int a[100][100]){
    int i,j;
    for(i=0;i<n;i++){
        for (j=0; j<m; j++) {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }
}

int main(int argc, const char * argv[]) {
    int n,m;
    int a[100][100];
    n = nhap();
    m = nhap();
    for(int i=0; i<n ;i++){
        for (int j=0;j<m; j++) {
            a[i][j] = rand()%10 + 1;
        }
    }
    xuat(n, m,a);
    return 0;
}
