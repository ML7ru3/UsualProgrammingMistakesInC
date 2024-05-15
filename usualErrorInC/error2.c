#include <stdio.h>
#include <stdlib.h>

int *matvec(int **A, int *x, int n){
    int i,j;

    int *y = (int *)malloc(n * sizeof(int));
    for (i = 0; i < n; i++)
    for (j = 0; j < n; j++)
        y[i] += A[i][j] * x[j];
    return y;
}

int main(){
    int n = 2;
    int *x = (int *)malloc(n * sizeof(int));
    int **A = (int **)malloc(n * sizeof(int *));
    for (int i = 0; i < n; i++) A[i] = (int *)malloc(n * sizeof(int));
    x[0] = 1;
    x[1] = 2;
    A[0][0] = 1;
    A[0][1] = 3;
    A[1][0] = 2;
    A[1][1] = 5;
    int *y = matvec(A, x, n);
    for (int i = 0; i < n; i++) printf("%d ", y[i]);
}

