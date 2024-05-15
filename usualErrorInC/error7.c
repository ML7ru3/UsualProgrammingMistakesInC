#include <stdio.h>
int *search(int *p, int val){
    while (*p && *p != val)
        p+= sizeof(int);
    return p;
}

int main(){
    int x = 5;
    int y = -2;
    int *u = &x;
    u = search(u, y);
    printf("%d", u);
}