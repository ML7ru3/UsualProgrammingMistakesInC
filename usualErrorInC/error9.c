#include <stdio.h>
#include <stdlib.h>
int *heapref(int n, int m) {
    int i;
    int *x, *y;

    x = (int *)malloc(n * sizeof(int));



    free(x);

    y = (int *)malloc(m * sizeof(int));
    for (i = 0; i < m; i++)
        y[i] = x[i]++;
    return y;
}

int main(){
    int z = *heapref(5,6);
    printf("%d",z);
}