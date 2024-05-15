#include <stdio.h>
#include <stdlib.h>

int **makeArray2(int n, int m){
    int i;
    int **A = (int **)malloc(n * sizeof(int*));

    for (i = 0; i <= n; i++) A[i] = (int *)malloc(m * sizeof(int));
    return A;
}

int main(){
    int n = 3, m = 4;
    int **a = makeArray2(3,4);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) printf("%d ", a[i][j]);
        printf("\n");
    }
}