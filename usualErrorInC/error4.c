#include <stdio.h>
#include <stdlib.h>

int **makeArray1(int n, int m){
    int i;
    int **A = (int **)malloc(n * sizeof(int));

    for (i = 0; i < n; i++) 
        A[i] = (int *)malloc(m * sizeof(int));
    return A;
}

int main(){
    int **x;
    x = makeArray1(3,4);
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 4; j++) printf("%d ", x[i][j]);
        printf("\n");
    }
}