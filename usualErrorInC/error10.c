#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void leak(int n){
    int *x = (int *)malloc(n * sizeof(int));
    //programmer didn't free it
    return;
}

int main(){
    int n = 5;
    int *pn = &n;
    leak(n);
    printf("%d", n);
    // memory leaked and can not be freed anymore
}