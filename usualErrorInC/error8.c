#include <stdio.h>
#include <stdlib.h>

int *stackref(){
    int val = 5;
    return &val;
}

int main(){
    int *pval = stackref();
    printf("%d", *pval);
}